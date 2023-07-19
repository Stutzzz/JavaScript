var memoria = "";
var operador = "";
var novoNumero = true;

function inserir(valor) {
    var display = document.getElementById("display");
    
    if (novoNumero) {
        display.value = valor;
        novoNumero = false;
    } else {
        display.value += valor;
    }
}

function calcular() {
    var display = document.getElementById("display");
    var resultado;
    
    switch (operador) {
        case "+":
            resultado = parseFloat(memoria) + parseFloat(display.value);
            break;
        case "-":
            resultado = parseFloat(memoria) - parseFloat(display.value);
            break;
        case "*":
            resultado = parseFloat(memoria) * parseFloat(display.value);
            break;
        case "/":
            resultado = parseFloat(memoria) / parseFloat(display.value);
            break;
    }
    
    display.value = resultado;
    memoria = resultado;
    novoNumero = true;
}

function limpar() {
    var display = document.getElementById("display");
    display.value = "";
    memoria = "";
    operador = "";
    novoNumero = true;
}
