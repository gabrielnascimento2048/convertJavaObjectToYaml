import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class Convert {

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {

        Employee employee = new Employee();


        // Create an ObjectMapper mapper for YAML
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());

// Write object as YAML file
        mapper.writeValue(new File("C:\\Users\\Gabriel.NASCIMENTO\\Documents\\employee.yml"), employee);

    }
}