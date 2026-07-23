package ph.edu.dlsu.lbycpob.gradetracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class StudentFormDTO {
    // ---- Identity fields ----
    @NotBlank(message = "Student name is required.")
    private String name;

    @NotBlank(message = "ID number is required.")
    @Size(min = 8, max = 8, message = "ID number must be exactly 8 digits.")
    @Pattern(regexp = "\\d{8}", message = "ID number must contain exactly 8 digits.")
    private String idNumber;


}
