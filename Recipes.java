package desserts;

import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors

public class Recipes {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("cupcakes.txt");
			writer.write("Preheat oven to 375f or 190c; line muffin cups with papers.\r\n"
					+ "Cream butter and sugar till light and fluffy (make sure the butter is room temp so the mixture doesn't clump) . "
					+ "Beat in eggs one at a time.\r\n"
					+ "Add flour (mixed with baking powder and salt) alternating with milk beat well; stir in vanilla.\r\n"
					+ "Divide evenly among pans and bake for 18 minutes. Let cool in pans and enjoy! :)."
					+ " ");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter("tiramisu.txt");
			writer.write(
					"Whisk espresso and Grand Marnier. Grand Marnier makes this a boozier tiramisu because there is alcohol in both the coffee mixture and the mascarpone cream. "
							+ "Dip half of the ladyfingers in the espresso mixture. "
							+ "Line dipped ladyfingers in bottom of pan. Arrange dipped ladyfingers in the baking pan to make one solid layer. "
							+ "Beat mascarpone and rum together. Use quality mascarpone."
							+ "Though this is primarily an espresso-flavored dessert, tiramisu has rum as well.\r\n"
							+ "Gently cook egg yolks and sugar. Egg yolks are a main ingredient in tiramisu. "
							+ "Use a double boiler or makeshift bowl/saucepan double boiler to cook egg yolks and sugar together. "
							+ "Beat egg yolks into mascarpone cream mixture.\r\n"
							+ "Make whipped cream. Whip heavy cream and vanilla extract into medium peaks.\r\n"
							+ "Fold whipped cream into mascarpone cream mixture. \r\n"
							+ "Whip egg whites, salt, and sugar. Beat the egg whites and salt together until foamy, then slowly pour in sugar and beat until stiff peaks form.\r\n"
							+ "Fold egg white mixture into mascarpone cream mixture.\r\n"
							+ "Layer half of the cream mixture on top of the ladyfingers. An offset spatula helps.\r\n"
							+ "Dip and layer remaining ladyfingers.\r\n"
							+ "Top with remaining cream mixture, then chill for for 2-3 hours. \r\n"
							+ "Dust with cocoa. After chilling for a couple hours, dust the top layer with a dense layer of unsweetened cocoa powder."
							+ "Use a sifter. "
							+ "This is a classic finishing touch to the entire tiramisu dessert.\r\n");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter("cookies.txt");
			writer.write( "Preheat oven to 375 degrees F (190 degrees C). In a small bowl, stir together flour, baking soda, and baking powder. Set aside.\r\n"
							+ "In a large bowl, cream together the butter and sugar until smooth. Beat in egg and vanilla. \r\n"
							+ "Gradually blend in the dry ingredients. \r\n"
							+ "Roll rounded teaspoonfuls of dough into balls, and place onto ungreased cookie sheets.\r\n"
							+ "Bake 8 to 10 minutes in the preheated oven, or until golden. \r\n"
							+ "Let stand on cookie sheet two minutes before removing to cool on wire racks.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter("gingerbread.txt");
			writer.write("Sift together the flour, bicarbonate of soda, ginger and cinnamon and pour into the bowl of a food processor. Add the butter and blend until the mix looks like breadcrumbs. Stir in the sugar."
					+ "Lightly beat the egg and golden syrup together, add to the food processor and pulse until the mixture clumps together. Tip the dough out, knead briefly until smooth, wrap in cling film and leave to chill in the fridge for 15 minutes."
					+ "Preheat the oven to 180C/160C Fan/Gas 4. Line two baking trays with greaseproof paper."
					+ "Roll the dough out to a 0.5cm/¼in thickness on a lightly floured surface. Using cutters, cut out the gingerbread men shapes and place on the baking tray, leaving a gap between them."
					+ "Bake for 12–15 minutes, or until lightly golden-brown. Leave on the tray for 10 minutes and then move to a wire rack to finish cooling. When cooled decorate with the writing icing and cake decorations, if using.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("IceCreamCake.txt");
			writer.write("You need 1 package of chocolate cake mix. Prepare cake according to package directions; bake in a 9x13 inch baking dish and cool completely."
					+ "Use ice cream that comes in a rectangular carton. Remove the carton and, using a piece of string or dental floss, cut the ice cream in half lengthwise (long side to long side) and place the two layers side by side on a piece of waxed paper."
					+ "Place the cooled cake over the ice cream. Trim the cake and ice cream so that the edges match."
					+ "Place a board or serving platter over the cake, hold onto the waxed paper and board, and flip the ice cream cake over. Remove the waxed paper and smooth out the seam between the ice cream slabs."
					+ "Cover with waxed paper and freeze until very firm. Decorate as desired.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("fudge.txt");
			writer.write("To make this fudge, you’ll start out by combining everything in a large saucepan. Then, place the saucepan over medium heat and stir the mixture continuously until it’s nice and smooth. "
					+ "Once the mixture is completely smooth, remove it from the heat and scoop it into an 8-inch square baking dish. You can line the dish with parchment paper or foil and leave some overhang before adding the fudge. This will make it much easier to lift it out of the pan and slice the fudge!"
					+ "You’ll spread the fudge into one even layer, then cover it, and place it in the refrigerator. It will take about 3 hours to fully firm up, so you can even prep this the night before too.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("ChocolateMuffins.txt");
			writer.write("Preheat oven to 400 degrees F (200 degrees C). Grease 12 muffin cups or line with paper muffin liners."
					+ "Combine flour, sugar, 3/4 cup chocolate chips, cocoa powder, and baking soda in a large bowl. Whisk egg, yogurt, milk, vanilla, and vegetable oil in another bowl until smooth; pour into chocolate mixture and stir until batter is just blended. Fill prepared muffin cups 3/4 full and sprinkle with remaining 1/4 cup chocolate chips."
					+ "Bake in preheated oven until a toothpick inserted into the center comes out clean, about 20 minutes. Cool in the pans for 10 minutes before removing to cool completely on a wire rack.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("SnickersCake.txt");
			writer.write("You need 1 package of chocolate cake mix. Bake the cake according to the package directions.\r\n"
					+ "Cool for 10 minutes.\r\n"
					+ "Poke holes all over cake using a drinking straw. Be careful not to go all the way through to the bottom.\r\n"
					+ "Pour 1/2 cup of caramel topping over the top of the cake.\r\n"
					+ "Use a spatula to spread it around so it gets into all of the holes.\r\n"
					+ "In a bowl, mix thawed whipped topping with the remaining caramel topping.\r\n"
					+ "Spread the whipped topping mixture on top of the cake.\r\n"
					+ "Chop the SNICKERS bars into small pieces.\r\n"
					+ "Sprinkle chopped SNICKERS on top of the cake.\r\n"
					+ "Drizzle with chocolate syrup and extra caramel sauce before serving, if desired.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("PeachPie.txt");
			writer.write("Preheat oven to 425 degrees F.\r\n"
					+ "Stir together flour, 1 cup sugar, and cinnamon and set aside.\r\n"
					+ "Wash, peel, and slice fresh peaches.\r\n"
					+ "Mix together peaches with the combined dry ingredients.\r\n"
					+ "Turn into pastry-lined pie pan and dot with butter.\r\n"
					+ "Cover with top crust, cut slits in it, seal the edges.\r\n"
					+ "Sprinkle top with 2 tablespoons of sugar.\r\n"
					+ "Cover the edges with foil to prevent over browning; remove foil for the last 15 minutes of baking.\r\n"
					+ "Bake 35 to 45 minutes or until crust is brown and juice begins to bubble through the slits in the crust.\r\n"
					+ "Pie may be frozen for future use.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("eclairs.txt");
			writer.write("Essentially you’ll melt some butter and water in a pan, bring it to a boil, add the flour, sugar, and salt, create a paste, then turn off the heat. As you stir this mixture, it will cook and pull away from the sides. Then spread out the dough mixture to create a space for the beaten eggs to rest. This will prevent them from scrambling on the hot pan. Then you can pipe it into circles for cream puffs or profiteroles or pipe them into straight lines for eclairs!" 
					+ "Add egg yolks, sugar, and cornstarch in a bowl, whisk until a smooth paste forms. Set aside.\r\n"
					+ "Then in a large saucepan heat milk, vanilla paste, and pod until simmering. Strain out the bean. Allow to cool slightly.\r\n"
					+ "Add the warm milk slowly to the egg mixture whisking all the while until combined. Wash out the saucepan."
					+ "Then strain this mixture through a fine-mesh sieve back into a clean saucepan. Heat custard on medium-high, whisking all the while until thickened.\r\n"
					+ "Remove it from heat. Allow it to cool slightly. Add a pat of butter, whisk until smooth. Pierce bottom of éclairs with ¼” serrated tip, screwing the tip into the éclair to form a hole. Make 3 holes, equidistant. "
					+ "Transfer pastry cream to a pastry bag fitted with the same tip and fill each hole with the cream until éclair feels full and heavy.");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}