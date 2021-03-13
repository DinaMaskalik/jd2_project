package it.academy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "T_DOCUMENT")
@AllArgsConstructor
@NoArgsConstructor
public class Document {

    @Id
    @Column(name = "D_DOCUMENT_ID")
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String documentId;

    @OneToOne
    @JoinColumn(name = "D_DOCUMENT_NAME")
    private DocumentName documentName;

    @OneToOne
    @JoinColumn(name = "D_CONTENT")
    private Content content;

    @Column(name = "D_AUTHOR")
    private String author;

    @Column(name = "D_CREATE_DATE")
    private Date createDate;

    @Column(name = "D_PERSON_WITH_WHOM_THE_CONTRACT_WAS_SIGNED")
    private String personWithWhomTheContractWasSigned;

    @Column(name = "D_PERSON_WHO_CONCLUDED_CONTRACT")
    private String personWhoConcludedContract;

    @Column(name = "D_PERIOD_OF_EXECUTION")
    private Long periodOfExecution;
}
