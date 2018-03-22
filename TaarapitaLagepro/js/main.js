const {BrowserWindow,app} = require('electron')
const path = require('path')
const url = require('url')

const statusWindow = {main:'../html/main.html',login :'../html/login.html'};
let login, main;

function createWindow () 
{
  // Create the browser window.
  main = new BrowserWindow({width:800, height: 600, title: main, show: false})
  login = new BrowserWindow({width:800, height: 600, title: login, parent: main, modal: true})
  // and load the index.html of the app.
  login.loadURL(url.format({
    pathname: path.join(__dirname, statusWindow.login),
    protocol: 'file:',
  }))

  main.loadURL(url.format({
    pathname: path.join(__dirname, statusWindow.main),
    protocol: 'file:',
  }))

  login.setMenu(null)
  main.setMenu(null)
  
  login.once('ready-to-show', ()=>{
        login.show();  
  })
    
  
  // Open the DevTools.
// login.webContents.openDevTools()
  login.on('closed', function () {
    main.reload();
    main.show();
    login = null;
  })
  main.on('closed', function(){
    main = null
  })
}



app.on('ready',createWindow)

app.on('window-all-closed', function () {
  if (process.platform !== 'darwin') {
    app.quit()
  }
})

app.on('activate', function () {
  if (login === null) {
    createWindow()
  }
})
module.exports = {LoginWin: login, MainWin: main}