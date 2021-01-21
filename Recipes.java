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
					+ "Divide evenly among pans and bake for 18 minutes. Let cool in pans and enjoy! :).");
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
							+ "This is a classic finishing touch to the entire tiramisu dessert.\r\n"
							+ "Chill overnight. You can chill it for up to 1 day, so it’s a great make-ahead dessert recipe!");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileWriter writer = new FileWriter("cookies.txt");
			writer.write(
					"Preheat oven to 375 degrees F (190 degrees C). In a small bowl, stir together flour, baking soda, and baking powder. Set aside.\r\n"
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
			writer.write("ginger");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("IceCreamCake.txt");
			writer.write("ice cream");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("fudge.txt");
			writer.write("fudge");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("ChocolateMuffins.txt");
			writer.write("chocolate");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("SnickersCake.txt");
			writer.write("snickers");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("PeachPie.txt");
			writer.write("peach pie");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileWriter writer = new FileWriter("eclairs.txt");
			writer.write("eclairs");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}