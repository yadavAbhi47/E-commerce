package com.example.project.payload;


import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    @NotBlank
    @Min(value = 1, message = "Category id must be greater than 0")
    private Long categoryId;

    private String categoryName;
}
