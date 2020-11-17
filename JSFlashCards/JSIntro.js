var currentIndex=0
const displays=[
    'Hello World!',
    'I am JS!',
    'I am the infamous scripting language for HTML!',
    'You can check me out <a href=\"https://developer.mozilla.org/en-US/docs/Web/JavaScript\">here</a> in Mozilla\'s documentation!'
]
function onButtonClick(direction) {
    console.assert((typeof direction)==='string')
    if (direction==='right') {
        currentIndex+=1
        if (currentIndex>=displays.length) {
            currentIndex=0
        }
    } else if (direction==='left') {
        currentIndex-=1;
        if (currentIndex<0) {
            currentIndex=displays.length-1
        }
    }
    document.getElementById('hw').innerHTML=displays[currentIndex]
}
function fireEvent(direction) {
    console.assert((typeof direction)==='string')
    let currentButton=document.getElementById(`${direction}_button`)
    if (currentButton.fireEvent) {
        currentButton.fireEvent('onclick')
    } else {
        let eventObj=document.createEvent('MouseEvents')
        eventObj.initEvent('click',true,false)
        currentButton.dispatchEvent(eventObj)
    }
}
window.addEventListener('keydown',event=>
    console.log(event.key.slice(5,event.key.length-1).toLowerCase())
)