/*!
* Start Bootstrap - Shop Homepage v5.0.6 (https://startbootstrap.com/template/shop-homepage)
* Copyright 2013-2023 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-shop-homepage/blob/master/LICENSE)
*/
// This file is intentionally blank
// Use this file to add JavaScript to your project
let abrirPopup1 = document.getElementById('btn-abrir-popup1'),
    abrirPopup2 = document.getElementById('btn-abrir-popup2'),
    abrirPopup3 = document.getElementById('btn-abrir-popup3'),
    abrirPopup4 = document.getElementById('btn-abrir-popup4'),
    abrirPopup5 = document.getElementById('btn-abrir-popup5'),
    abrirPopup6 = document.getElementById('btn-abrir-popup6'),
    abrirPopup7 = document.getElementById('btn-abrir-popup7'),
    abrirPopup8 = document.getElementById('btn-abrir-popup8'),
    abrirPopup10 = document.getElementById('btn-abrir-popup10'),
    abrirPopup11 = document.getElementById('btn-abrir-popup11'),
    abrirPopup12 = document.getElementById('btn-abrir-popup12'),
    abrirPopup13 = document.getElementById('btn-abrir-popup13'),
    abrirPopup14 = document.getElementById('btn-abrir-popup14'),
    abrirPopup15 = document.getElementById('btn-abrir-popup15'),
    abrirPopup16 = document.getElementById('btn-abrir-popup16'),
    abrirPopup17 = document.getElementById('btn-abrir-popup17'),
    abrirPopup9 = document.getElementById('navbarDropdown'),
    overlay = document.getElementById('overlay'),
    overlay2 = document.getElementById('overlay2'),
    popup = document.getElementById('popup'),
    popup2 = document.getElementById('popup2'),
    cerrarPopup = document.getElementById('btn-cerrar-popup'),
    cerrarPopup2 = document.getElementById('btn-cerrar-popup2');

abrirPopup1.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup2.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup3.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup4.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup5.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup6.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup7.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup8.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup9.addEventListener('click', ()=> {
    overlay2.classList.add('active');
    popup2.classList.add('active');
})
abrirPopup10.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup11.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup12.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup13.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup14.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup15.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup16.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})
abrirPopup17.addEventListener('click', ()=> {
    overlay.classList.add('active');
    popup.classList.add('active');
})

cerrarPopup.addEventListener('click', ()=> {
    overlay.classList.remove('active');
    overlay.classList.remove('active');
})
cerrarPopup2.addEventListener('click', ()=> {
    overlay2.classList.remove('active');
    popup2.classList.remove('active');
})

function irArriba() {
    window.addEventListener('scroll', ()=> {
        let scroll = document.documentElement.scrollTop;
        console.log(scroll);
        let botonArriba = document.getElementById('subir');

        if (scroll > 180) {
            botonArriba.style.right = 20 + "px";
        }
        else {
            botonArriba.style.right = -100 + "px";
        }
    })
}
irArriba();

let placeholderInicial = '';

function quitarPH(input) {
    placeholderInicial = input.placeholder;
    input.placeholder = '';
}

function restaurarPH(input) {
    input.placeholder = placeholderInicial;
}