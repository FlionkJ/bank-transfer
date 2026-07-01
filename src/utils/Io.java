package utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Io {
	public static JsonObject loadJsonFile(String filePath) {

		try (FileReader reader = new FileReader(filePath)) {
			// Read the file and parse it as a JsonObject.
			return JsonParser.parseReader(reader).getAsJsonObject();
		} catch (IOException e) {
			System.err.println(String.format("Error saving the JSON file: %s", e.getMessage()));
			e.printStackTrace();
			return null;
		}
	}

	public static void saveJsonFile(JsonObject jsonObject, String filePath) {

		// Create Gson with pretty printing so that the file is readable.
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// Try-with-resources automatically closes the FileWriter at the end.
		try (FileWriter writer = new FileWriter(filePath)) {
			gson.toJson(jsonObject, writer);
			System.out.println(String.format("JSON successfully saved to: %s", filePath));
		} catch (IOException e) {
			System.err.println(String.format("Error saving the JSON file: %s", e.getMessage()));
			e.printStackTrace();
		}
	}
}
