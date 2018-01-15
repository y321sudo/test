document.write("■問1■<br>")
for(var i=0;i<5;i++){
    document.write("★");
}

document.write("<br><br>■問2■<br>")
for(var star1=1;star1<3;star1++){
    for(var star2=1;star2<=3;star2++){
    document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>■問3■<br>")
for(var a1=1;a1<3;a1++){
    for(var a2=5;a2>=1;a2--){
        document.write("☆");
    }
        document.write("<br>");
}

document.write("<br><br>■問4■<br>")
for(var b1=10;b1>6;b1--){
    for(var b2=1;b2<=5;b2++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>■問5■<br>")
for(var c1=1;c1<5;c1++){
    for(var c2=4;c2>1;c2--){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br><br>■問6■<br>")
for(var d1=1;d1<=3;d1++){
    for(var d2=1;d2<=3;d2++){
    if(d2%2==0){
        document.write("☆");
    }else{
        document.write("★");
    }
    }
    document.write("<br>");
}

document.write("<br><br>■問7■<br>")
for(var f1=1;f1<5;f1++){
    for(var f2=1;f2<=5;f2++){
        if(f2%2==0){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br><br>■問8■<br>")
for(var y1=1;y1<=5;y1++){
    for(var y2=1;y2<=y1;y2++){
        document.write("★");
    }
    document.write("<br>");
}


