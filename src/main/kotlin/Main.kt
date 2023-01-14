fun main(){

val likes = 103 //вводим количество лайков
var lastDigit=likes%10 //проверяем оканчивается ли число на единицу (чтобы выбрать вариант)
if (likes!=1 && lastDigit!=1) { println("понравилось $likes людям") }
  else if(likes==11){println("понравилось $likes людям")}
  else println("понравилось $likes человеку")
}