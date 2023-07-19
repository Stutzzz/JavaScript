function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fano = document.getElementById("ano")
    var res  = document.getElementById("res")
    if(fano.value.length === 0 || Number(fano.value) > ano){
        alert("[ERRO]")
    }else{
    var fsex = document.getElementsByName("sexo")
    var idade = ano - Number(fano.value)
    var genero = ""
    var img = document.createElement("img")
    img.setAttribute("id","foto")
    if(fsex[0].checked){
        genero = "Homem"
        if(idade >=0 && idade <6){
            // bebe
            img.setAttribute("src", "./bbh.jpg")
        }else if(idade >=7 && idade <12){
            // crianca
        }else if (idade >=12 && idade <18){
            // jovem
        }else if (idade >=18 && idade <50){
            // adulto
        }else{
            // velho
        }
   
    }else if (fsex[1].checked){
        genero = "Mulher"
        if(idade >=0 && idade <6){
            // bebe
        }else if(idade >=7 && idade <12){
            // crianca
        }else if (idade >=12 && idade <18){
            // jovem
        }else if (idade >=18 && idade <50){
            // adulto
        }else{
            // velho
        }
    }
    res.style.textAlign = "center"
    res.innerHTML = `${genero} com ${idade} anos!`
    res.appendChild(img)
}
}