package test;

import com.coderscampus.Assignment9.domain.Recipe;
import com.coderscampus.Assignment9.service.FileService;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileServiceTest {

    @Test
    void test_read_file() throws IOException {
        FileService fileService = new FileService();
        List<Recipe> recipes = new ArrayList<>();

        recipes = fileService.readFile();
    }
}