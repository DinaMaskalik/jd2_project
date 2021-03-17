package it.academy.dao.interfaces;

import it.academy.entity.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface DocumentFilterDao extends JpaRepository<Document,String> {

    @Query("select distinct d.author from Document d ")
    List<String> getAuthor();

    @Query("select distinct doc.documentName from DocumentName doc")
    List<String> getDocumentName();

    @Query("select distinct d.personWhoConcludedContract from Document d")
    List<String> getPersonWhoConcludedContract();

    @Query("select distinct d.personWithWhomTheContractWasSigned from Document d")
    List<String> getPersonWithWhomTheContractWasSigned();

//    @Query("select d from Document d where d.author = ?1")
//    List<Document> getFilterDocument(String result, Pageable pageable);

    List<Document> findByAuthor(String author);

    @Query("select d from Document d " +
            "join d.documentName doc " +
            "where doc.documentName = ?1")
    List<Document> findByDocumentName(String name);

    List<Document> findByPersonWhoConcludedContract(String person);

    List<Document> findByAuthorAndPersonWhoConcludedContract(String author, String person);

    @Query("select d from Document d " +
            "join d.documentName doc " +
            "where d.author = ?1 and doc.documentName = ?2")
    List<Document> findByAuthorAndName(String author, String name);

    @Query("select d from Document d " +
            "join d.documentName doc " +
            "where d.personWhoConcludedContract = ?1 and doc.documentName = ?2")
    List<Document> findByPersonWhoConcludedContractAndName(String person, String name);

    @Query("select d from Document d " +
            "join d.documentName doc " +
            "where d.author = ?1 and doc.documentName = ?2 and d.personWhoConcludedContract = ?3")
    List<Document> findByAuthorAndDocumentNameAndPersonWhoConcludedContract(String author, String name, String person);


}
