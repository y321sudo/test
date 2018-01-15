document.write("■問1■<br>")
function menseki(hankei,ensyu=3.14){
    return(hankei*hankei*ensyu)
}

document.write(menseki(5)+"<br>");
document.write(menseki(7)+"<br>");
document.write(menseki(10)+"<br>");


document.write("<br><br>■問2■<br>")
function group(adult,child){
    return"グループは"+(adult*500+child*200)+"円です。";
}

document.write("A"+group(2,4)+"<br>");
document.write("B"+group(1,5)+"<br>");
document.write("C"+group(3,7)+"<br>");