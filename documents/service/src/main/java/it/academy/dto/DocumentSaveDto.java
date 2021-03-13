package it.academy.dto;

import lombok.Data;

@Data
public class DocumentSaveDto {

    private String documentName;

    private String content;

    private String author;

    private String personWithWhomTheContractWasSigned;

    private String personWhoConcludedContract;

    private Long periodOfExecution;
}
