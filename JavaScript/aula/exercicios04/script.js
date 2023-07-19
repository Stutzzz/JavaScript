function tabuada(){
    let num = document.getElementById("txtn")
    let tab = document.getElementById("seltab")
    if (num.value.length == 0){
        window.alert("Por favor, digite um numero!")
    }else{
        let n = Number(num.value)        
        tab.innerHTML= ""
        for(let c = 1;c <=10;c++){
            let mult = document.createElement("option")
            mult.text = `${n} x ${c} = ${n*c} `
            mult.value = `tab${c}`
            document.querySelector("select#seltab").appendChild(mult)
        }
}
}