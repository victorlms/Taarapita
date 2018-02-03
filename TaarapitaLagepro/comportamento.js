function startList()
{
	var myList, node;

	myList = document.getElementById("myList");

	for(var i=0; i < myList.childNodes.length;i++)
	{
		node = myList.childNodes[i];

		if (node.nodeName=="LI") 
		{
			node.onmousedown=function()
			{
				if(this.className=="listActive")
					this.className="";
				else
					this.className+="listActive";
			}
		}
	}
}