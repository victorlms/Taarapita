
function loadMyHtml(fileName)//Nome do arquivo com o local dele, lembrando que __dirname+"/nome.tipo" é o que se espera
{
	var fs = require('fs');
	var temp;

	fs.readFile(fileName, 'utf8', function(err,data){

            if(err) {
                console.log("Could not open file: %s", err);
              
            }
      fs.writeFile(fileName+'.json', JSON.stringify(data, null, "    "));

    });

    temp = test = JSON.parse(fs.readFileSync(fileName+'.json', 'utf8'));
    /*
    fs.unlink(fileName+'.json', function(error) {
            if (error) {
                console.log(error);
            }
            console.log('Deleted '+ fileName+ '.json!!');
     });
*/
    return temp;
}
module.exports = {LoadHtml:loadMyHtml};