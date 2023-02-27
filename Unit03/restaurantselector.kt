println("Is anyone in your party a vegetarian? Y/N ")
	val string1 = readln()
		when {
			string1 = Y -> vege = 0
			string2 = N -> vege = 1
	

println("Is anyone in your party a vegan? ")
	val string2 = readln()
		when {
			string2 = Y -> vega = 0
			string2 = N -> vega = 1
println("Is anyone in your party gluten-free?")
	val string3 = readln()
		when {
			string3 = Y -> gf = 0
			string3 = N -> gf = 1


if (($vege = 1) and ($vega = 1) and ($gf = 1)) 
	println("Here are your restaurant choices: ")
	println("Joe’s Gourmet Burgers") 
	println("Main Street Pizza Company")
	println("Corner Café")
	println("Mama’s Fine Italian")
	println("The Chef’s Kitchen")
else if (($vege == 0) and ($vega == 1) and ($gf == 1))
	println("Here are your restaurant choices: ") 
	println("Main Street Pizza Company")
	println("Corner Café")
	println("Mama’s Fine Italian")
	println("The Chef’s Kitchen")
else if (($vege == 0) and ($vega == 0) and ($gf == 1))
	println("Here are your restaurant choices: ")
	println("Main Street Pizza Company")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if (($vege == 0) and ($vega == 0) and ($gf == 0))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if (($vege == 1) and ($vega == 0) and ($gf == 0))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")
else if (($vege == 1) and ($vega == 0) and ($gf == 1))
	println("Here are your restaurant choices: ")
	println("Corner Café")
	println("The Chef’s Kitchen")