fun main() {

var vege: Int = null
var vega: Int = null
var gf: Int = null

while (vege == null) {
println("Is anyone in your party a vegetarian? Y/N ")
	var string1 = readLine().toString()
		when {
			(string1.contains(y, ignoreCase=true)) -> vege = 0
			(string1.contains(n, ignoreCase=true)) -> vege = 1
		else -> println("Invalid entry, please try again.")
			} }
while (vega == null) {
println("Is anyone in your party a vegan? ")
	var string2 = readLine()?.toString()?:N
		when {
			(string2.contains(y, ignoreCase=true)) -> vega = 0
			(string2.contains(n, ignoreCase=true)) -> vega = 1
		else -> println("Invalid entry, please try again.")		
			} }
while (gf == null) {
println("Is anyone in your party gluten-free?")
	var string3 = readLine()?.toString()?:N
		when {
			(string3.contains(y, ignoreCase=true)) -> gf = 0
			(string3.contains(n, ignoreCase=true)) -> gf = 1
		else -> println("Invalid entry, please try again.")
			} }

if ((vege == 1) and (vega == 1) and (gf == 1)) 
	println("Here are your restaurant choices: ")
	println("Joe’s Gourmet Burgers") 
	println("Main Street Pizza Company")
	println("Corner Café")
	println("Mama’s Fine Italian")
	println("The Chef’s Kitchen")
else if ((vege == 0) and (vega == 1) and (gf == 1))
	println("Here are your restaurant choices: ") 
	println("Main Street Pizza Company")
	println("Corner Café")
	println("Mama’s Fine Italian")
	println("The Chef’s Kitchen")
else if ((vege == 0) and (vega == 0) and (gf == 1))
	println("Here are your restaurant choices: ")
	println("Main Street Pizza Company")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if ((vege == 0) and (vega == 0) and (gf == 0))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if ((vege == 1) and (vega == 0) and (gf == 0))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if ((vege == 1) and (vega == 0) and (gf == 1))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if ((vege == 1) and (vega == 1) and (gf == 0))
	println("Here are your restaurant choices: ")
	println("Main Street Pizza Company")
	println("Corner Café")
	println("The Chef’s Kitchen")
	
}