

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <script type="text/javascript">
		var pythons=new Array(26,35);
		var doors=new Array(6,41);
		var snakes=new Array([46,31],[15,2],[19,11]);
		var ladders=new Array([9,22],[34,47],[13,28]);
		var playersteps;

		//this function draws the game board dynamically.
		function draw(num)
		{
			var str="<table border=\"1\" bgcolor=\"#FFF6BF\">";
			var x=num*num,y;
			for(i=1;i<=num;i++)
			{
				str+="<tr height=\"70\">";
				if(num%2==0)
				{
					if(i%2!=0)
					{
						x=x-num+1;
						for(j=0;j<num;j++,x++)
						{
							str+="<td width=\"70\" align=\"center\" id=\""+x+"\">"+x+"</td>";
						}
					}
					else
					{
						x=x-num-1;
						for(j=0;j<num;j++,x--)
						{
							str+="<td width=\"70\" align=\"center\" id=\""+x+"\">"+x+"</td>";
						}
					}
				}
				else
				{
					if(i%2!=0)
					{
						if(i!=1)
						{
							x=x-num-1;
						}
						for(j=0;j<num;j++,x--)
							str+="<td width=\"70\" align=\"center\" id=\""+x+"\">"+x+"</td>";
					}
					else
					{
						x=x-num+1;
						for(j=0;j<num;j++,x++)
							str+="<td width=\"70\" align=\"center\" id=\""+x+"\">"+x+"</td>";
					}
				}
				str+="</tr>";
			}
			str+="</table>";

			document.getElementById("board").innerHTML=str;
			document.getElementById(num*num).innerHTML="<img src=\"images/snl/star.gif\" width=\"70\" height=\"70\"></img>";

			//Loop to generate pythons.
			for(i=0;i<pythons.length;i++)
			{
				if(pythons[i]%2!=0)
				{
					document.getElementById(pythons[i]).innerHTML="<img src=\"images/snl/python1.gif\" width=\"70\" height=\"70\"></img>";
				}
				else
				{
					document.getElementById(pythons[i]).innerHTML="<img src=\"images/snl/python2.gif\" width=\"70\" height=\"70\"></img>";
				}
			}

			//Loop to generate Magic doors.
			for(i=0;i<doors.length;i++)
			{
					document.getElementById(doors[i]).innerHTML="<img src=\"images/snl/door1.gif\" width=\"70\" height=\"70\"></img>";
			}

			/*
			//loop to mark the ladders and snakes.
			for(i=0;i<ladders.length;i++)
			{
				document.getElementById(ladders[i][0]).innerHTML="L"+ladders[i][0];
			}
			for(i=0;i<snakes.length;i++)
			{
				document.getElementById(snakes[i][0]).innerHTML="S"+snakes[i][0];
			}

			*/
		}

		//this function populates buttons based on the total number of players.
		function loadbuttons()
		{
			totalplayers=document.snl.players.value;
			if(isNaN(totalplayers))
			{
				alert("Invalid input.");
				return;
			}
			if(totalplayers>4)
			{
				alert("Maximum 4 players can play.");
				return;
			}
			str=" ";
			for(i=0;i<totalplayers;i++)
			{
				if(i==0)
					str+="<img src=\"images/snl/coin"+(i+1)+".gif\"></img><input type=\"button\" value=\"player "+(i+1)+" roll dice\" id=\"btn"+i+"\" onclick=\"startplay(7,"+i+")\"><br/>";
				else
					str+="<img src=\"images/snl/coin"+(i+1)+".gif\"></img><input type=\"button\" value=\"player "+(i+1)+" roll dice\" id=\"btn"+i+"\" onclick=\"startplay(7,"+i+")\" disabled=\"true\"><br/>";
			}
			document.getElementById("playerbtn").innerHTML =str;
			playersteps=new Array(totalplayers);
			for(i=0;i<totalplayers;i++)
				playersteps[i]=0;
			document.getElementById("okbtn").disabled=true;

		}

		// this function does the work of a dice.
		function rolldice()
		{
			var t=Math.floor((Math.random() * 10));
			dice=(t%6)+1;
			document.getElementById("dice").innerHTML ="<img src=\"images/snl/dice"+dice+".gif\" width=\"50\" height=\"50\" ></img>";
		}

		//the main function which is used to play the game executed by each player button.
		function startplay(num,playernum)
		{
			rolldice();
			oldstep=playersteps[playernum];
			playersteps[playernum]+=dice;

			//To enable the next players button
			document.getElementById("btn"+playernum).disabled=true;
			chk=-1;
			i=playernum;
			do
			{
				i++;
				if(i==playersteps.length)
					i=0;
				if(playersteps[i]>=0)
				{
					document.getElementById("btn"+i).disabled=false;
					break;
				}
				else
					document.getElementById("btn"+i).disabled=true;
			}while(i!=playernum);

			//Loop to handle the execution if the block reached is a magic door.
			for(i=0;i<doors.length;i++)
			{
				if(playersteps[playernum]==doors[i])
				{
					var t=Math.floor((Math.random() * 100));
					prevblock=playersteps[playernum];
					playersteps[playernum]=(t%(num*num))+1;

					//this loop checks if the player reaches again a teleport place then increase its position by 1.
					for(j=0;j<doors.length;j++)
					{
						if(playersteps[playernum]==doors[i])
						{
							playersteps[playernum]++;
							break;
						}
					}
					alert("Magic Door:Player"+(playernum+1)+" teleported to block-"+playersteps[playernum]+" from block-"+prevblock);
					break;
				}
			}

			//Loop to handle the execution if the block reached is a ladder.
			for(i=0;i<ladders.length;i++)
			{
				if(playersteps[playernum]==ladders[i][0])
				{
					prevblock=playersteps[playernum];
					playersteps[playernum]=ladders[i][1];
					alert("Player"+(playernum+1)+": Climbed to block-"+playersteps[playernum]+" from block-"+prevblock);
					break;
				}
			}

			//Loop to handle the execution if the block reached is a snake.
			for(i=0;i<snakes.length;i++)
			{
				if(playersteps[playernum]==snakes[i][0])
				{
					prevblock=playersteps[playernum];
					playersteps[playernum]=snakes[i][1];
					alert("Player"+(playernum+1)+": Eaten by snake to block-"+playersteps[playernum]+" from block-"+prevblock);
					break;
				}
			}

			//Loop to handle the execution if the block reached is a python.
			for(i=0;i<pythons.length;i++)
			{
				if(playersteps[playernum]==pythons[i])
				{
					alert("Game Over: Player"+(playernum+1)+" got swallowed by a python.");
					str=oldstep;
					for(i=0;i<playersteps.length;i++)
					{
						if(playersteps[i]==oldstep)
							str+="<img src=\"images/snl/coin"+(i+1)+".gif\"></img>"
					}
					document.getElementById(oldstep).innerHTML=str;
					playersteps[playernum]=-1;
					chk=0;
					for(i=0;i<playersteps.length;i++)
					{
						if(playersteps[i]>0)
						{
							chk=1;
							break;
						}
					}
					if(chk==0)
					{
						draw(7);
						document.getElementById("playerbtn").innerHTML ="";
						document.getElementById("players").value ="1";
						document.getElementById("dice").innerHTML ="";
						document.getElementById("okbtn").disabled=false;
					}
					return;
				}
			}

			//Updating the board based on the players position
			if(playersteps[playernum]<(num*num))
			{
				if(oldstep!=0)
				{
					str=oldstep;
					for(i=0;i<playersteps.length;i++)
					{
						if(playersteps[i]==oldstep)
							str+="<img src=\"images/snl/coin"+(i+1)+".gif\"></img>"
					}
					document.getElementById(oldstep).innerHTML=str;
				}
				str=playersteps[playernum];
				for(i=0;i<playersteps.length;i++)
				{
					if(playersteps[i]==playersteps[playernum])
						str+="<img src=\"images/snl/coin"+(i+1)+".gif\"></img>"
				}
				document.getElementById(playersteps[playernum]).innerHTML=str;
			}
			else if(playersteps[playernum]==(num*num))
			{
				alert("Congrats: Player"+(playernum+1)+" Won.");
				draw(7);
				document.getElementById("playerbtn").innerHTML ="";
				document.getElementById("players").value ="1";
				document.getElementById("dice").innerHTML ="";
				document.getElementById("okbtn").disabled=false;
			}
			else
				playersteps[playernum]=oldstep;
		}

	</script>
	<style type="text/css">
		#s1{
			position: absolute;
			left: 57%;
			top: 74%;
		}
		#s2{
			position: absolute;
			left: 72%;
			top: 120%;
		}
		#s3{
			position: absolute;
			left: 53.5%;
			top: 112%;
		}
		#l1{
			position: absolute;
			left: 41%;
			top: 107%;
		}
		#l2{
			position: absolute;
			left: 45.25%;
			top: 64.5%;
		}
		#l3{
			position: absolute;
			left:70%;
			top: 106.5%;
		}
		td{
			font-size:20px;
		}
	</style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>hotspot</title>
        <link href="style.css" rel="stylesheet" type="text/css" media="screen" />
        <style type="text/css">
        .newStyle1 {
            font-family: "Matura MT Script Capitals";
            text-decoration: blink;
            font-size: 75px;
            font-weight: lighter;
            font-style: normal;
            color: #FAD68C;
        }
        h1, h2, h3 {
	margin: 0;
	padding: 0;
	font-weight: normal;
	color: #FF3000;
}

h1 {
	font-size: 2em;
}

h2 {
	font-size: 2.8em;
}

h3 {
	font-size: 1.6em;
}

p, ul, ol {
	margin-top: 0;
	line-height: 180%;
}

ul, ol {
}

a {
	text-decoration: none;
	color:#241F1B;
    font-size: 20px;
}

a:hover {
}
</style>
    </head>
    <body style="margin: 0;
	padding: 0;
	background: #776D54 url(images/img01.jpg) repeat;
	font-family: Arial, Helvetica, sans-serif;
	font-size: 12px;
	color: #566761;">
        <table  width="1300"  bgcolor="#241F1B" >
            <tr height="120 px" >
            <td width="500" align="center"><h1><span class="newStyle1">hotspot</span></h1><br>
                <p style="margin: 0;
	padding: 0px 0 0 2px;
	font-style:italic;
	color: #999966;
    font-variant: normal;
    font-weight: normal;
    font-size: large;
    line-height: normal;
    font-family: Georgia;"> way to easy access ......</p><td>
        <td width="500"></td>
        <td width="1500" align="right">
            <a href="Logout" style="color: #999966;">Logout</a>
            </tr>
            </table>
            <table border="0" bgcolor="#AB0D06" fontfamily="font-family: Arial, Helvetica, sans-serif;" width="1300" align="center">
            <tr >
                <td align="center"><a href="index.jsp" >Home</a></td>
                    <td align="center"><a href="shopping.jsp" align="center">Shopping</a><td>
					<td align="center"><a href="mailing.jsp" align="center">Mailing</a></td>
					<td align="center"><a href="gaming.jsp" align="center">Gaming</a></td>
					<td align="center"><a href="feedback.jsp" align="center">Feedback</a></td>
<td align="center"><a href="profile.jsp" align="center">Profile</a></td>
            </tr>
        </table>
        <table width="1300">
            <tr>
                <td>
                    <div id="sidebar">
                    <ul>
						<li>
							<h2><br>Top Searches<br> </h2>
							<ul>
								<li><a href="gaming.jsp">Gaming</a></li>
								<li><a href="mailing.jsp">Mailing</a></li>
                                <li><a href="shopping.jsp">shopping</a></li>
							</ul>
						</li>

						<li><h2>Shopping</h2>
                            <h3 align="right"><a href="men.jsp">MEN WEAR</a></h3>
							<ul>
								<li><a href="men2.jsp">casual wear</a></li>
								<li><a href="men3.jsp">formal wear</a></li>
								<li><a href="men4.jsp">footwear</a></li>
								<li><a href="men5.jsp">accessories</a></li>
							</ul>
						</li>
                       <li>  <h3 align="right"><a href="electronics.jsp">ELECTRONICS</a></h3><ul>
                            <li><a href="electronics.jsp">computer and asseccories</a></li>
                            <li><a href="electronics.jsp">kitchen ware</a></li>
                            <li><a href="electronics.jsp">washing machine</a></li>
                        </ul></li>
						<li>
                            <h3 align="right"><a href="women.jsp">WOMEN WEAR</a></h3>
							<ul>
                                <li><a href="women2.jsp">jeans and skirt</a></li>
								<li><a href="women2.jsp">tops</a></li>
                                <li><a href="women3.jsp">ethinic wear</a></li>
								<li><a href="women4.jsp">footwear</a></li>
								<li><a href="women5.jsp">accessories</a></li>

							</ul>
						</li>
                        <li>
                            <h3 align="right"><a href="book.jsp">BOOKS</a></h3>
                            <ul>

                                 <li>   <a href="book.jsp">drama</a></li>
                                   <li><a href="book.jsp">romantic</a></li>

                                    <li><a href="book.jsp">fiction</a></li>


                            </ul>
					</ul>
				</div>
                <div style="clear: both;">
                    <br />
                    <br />
                </div>
                </td>
                <td bgcolor="#ffffff" width="1000">

<body onload="draw(7)" bgcolor="#8AB8E6">
	<center>
	<h2>Snakes and ladder game</h2>

	<table>
		<form name="snl">
		<tr>
			<td><div id="board"></div></td>
			<td width="71px">
				<div id="playerbtn"></div>
			</td>
			<td width="50px" height="50px"><div id="dice"></div></td>
		</tr>
		<tr>
			<td colspan="3" align="center"><br/>Select number of Players:
				<input type="text" value="1" name="players" id="players" size="1" maxlength="1">
				<input type="button" value="OK" onclick="loadbuttons()" id="okbtn">
			</td>
		</tr>
		<!--
		<tr>
			<td colspan="3" align="center"><br/>Total Players:
			<input type="radio" name="players" value="1" checked="checked" id="players" onchange="loadbuttons()">1 Player
						&nbsp;&nbsp;<input type="radio" name="players" value="2" id="players" onchange="loadbuttons()">2 Players
			</td>
		</tr>
		-->
		</form>
	</table>
	</center>
	<div id="s1">
	<img src="images/snl/snake1.gif"></img>
	</div>
	<div id="s2">
	<img src="images/snl/snake2.gif" width="105" height="165"></img>
	</div>
	<div id="s3">
	<img src="images/snl/snake3.gif"></img>
	</div>
	<div id="l1">
	<img src="images/snl/ladder1.gif"></img>
	</div>
	<div id="l2">
	<img src="images/snl/ladder2.gif"></img>
	</div>
	<div id="l3">
	<img src="images/snl/ladder3.gif"></img>
	</div>
</body>

<center>
<form action="gaming.jsp">


<input type="submit" value="back" name="BACK" size="3"   />
</form></center>



                </td>
            </tr>
        </table>

        <div id="footer">
	<p>Copyright (c) 2015 Sitename.com. All rights reserved. Design by FCT.</p>
</div>

    </body>
</html>
