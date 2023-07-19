let impapar = [1,2,5,1,5,3,2,5,45]
for(let c in impapar){
function parimpar(n){
    if(n%2 == 0){
        return "par"
    }else{
        return "impar"
    }
}
let func = parimpar(impapar[c])
console.log(`O Numero ${impapar[c]} e igual a ${func}`)
}