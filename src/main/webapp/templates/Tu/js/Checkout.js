const deliveryBtn = document.getElementsByClassName("RadioDelivery");
const total = document.getElementsByClassName("total");
const SubTotal = document.getElementsByClassName("SubTotal");
const deliveryPrice = document.getElementsByClassName("deliveryPrice");
for (let i = 0; i <= deliveryBtn.length; i++) {
    btn.addEventListener("click", function () {
        total[0].innerHTML = SubTotal + deliveryPrice[i];
    })
}