const {BrowserWindow,app} = require('electron')
const path = require('path')
const url = require('url')

const statusWindow = {main:'__dirname/../html/main.html',login :'__dirname/../html/main_do_gui.html'};
var login, main;

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
  login.setMenu(null)
  
  login.once('ready-to-show', ()=>{
        login.show();  
  }) 
  // Open the DevTools.
  main.webContents.openDevTools()
  login.on('closed', function () {
    //Carregando o main só depois de fechar load
      main.loadURL(url.format({
      pathname: path.join(__dirname, statusWindow.main),
      protocol: 'file:',
      }));

      main.setMenu(null);

      main.once('ready-to-show', ()=>{
            main.show();  
      });

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