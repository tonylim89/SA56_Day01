package sg.edu.nus.iss.sa56_day01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String id;
    private String firstName;
    private String lastName;    
}
