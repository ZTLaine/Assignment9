//  6/2/24
//  Zack Laine
//  Assignment 9

package test;

import com.coderscampus.Assignment9.domain.Recipe;
import com.coderscampus.Assignment9.service.FileService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FileServiceTest {

    @Test
    void test_read_file() throws IOException {
        FileService fileService = new FileService();
        List<Recipe> sut;
        Integer testIndex = 15;

        sut = fileService.readFile();

        System.out.println(sut.get(testIndex).toString());

        assertEquals(sut.get(testIndex).getCookingMinutes(), 65);
        assertEquals(sut.get(testIndex).getDairyFree(), false);
        assertEquals(sut.get(testIndex).getGlutenFree(), false);
        assertEquals(sut.get(testIndex).getInstructions(), "Preheat oven to 350° F. Butter a standard loaf pan or a 9\" round or square baking pan.Melt the butter and allow to cool.Meanwhile trim off the zucchini ends and thinly slice 6 or 7 rounds off the end for garnish. Coarsely grate the rest on the large holes of a box grater. Add it to the middle of a clean kitchen towel and gently ring out some (you don't need to get it all out) of the water.Into a large bowl sift both flours, cornmeal, baking powder, salt, and baking soda together.Whisk the eggs and buttermilk into the cooled butter then stir in the zucchini then the cheese.Add the zucchini mixture to the flour mixture and stir until just combined - the batter will be thick.Transfer to the prepared pan and smooth out the top. Arrange the zucchini slices over top.Bake until golden and a tester inserted into center comes out clean, 55-65 minutes for a loaf pan 40 - 50 minutes for a round or square pan.");
        assertEquals(sut.get(testIndex).getPreparationMinutes(), 25.0);
        assertEquals(sut.get(testIndex).getPricePerServing(), 416.92);
        assertEquals(sut.get(testIndex).getReadyInMinutes(), 90);
        assertEquals(sut.get(testIndex).getServings(), 1);
        assertEquals(sut.get(testIndex).getSpoonacularScore(), 99.0);
        assertEquals(sut.get(testIndex).getTitle(), "Cheddar Zucchini Cornbread");
        assertEquals(sut.get(testIndex).getVegan(), false);
        assertEquals(sut.get(testIndex).getVegetarian(), true);

    }
}