function contar() {
    var ini = document.getElementById("ini")
    var fim = document.getElementById("fim")
    var pas = document.getElementById("pas")
    var res = document.getElementById("res")
    

if(ini.value.length == 0 || fim.value.length == 0 || pas.value.length == 0){
    res.innerHTML = "impossivel contar!"
}else{
    res.innerHTML= "Contando: "
    let i = Number(ini.value)
    let f = Number(fim.value)
    let p = Number(pas.value)
if(p<=0){
window.alert ("[ERRO] Dados invalidos, considerando PASSO = 1")
p = 1
}
if(i<f){
    for(var c=i;c <=f;c+=p){
        res.innerHTML += `${c} \u{1F595}`
    }
}else{
    for(let c = i; c >= f;c-=p){
        res.innerHTML += `${c} \u{1F595}`
    }
}
    
}

}