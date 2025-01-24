package com.github.sxpersxnic.tbz.m320.payload.dto.request;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.List;
import java.util.UUID;

/**
 * @author sxpersxnic
 */
@Data
public class QuestionRequestDTO {

    @NotBlank(message = "Content cannot be empty")
    private String content;

    private String description;

    @Min(value = 2, message = "A minimum of two options is required")
    private List<UUID> optionIds;
}
