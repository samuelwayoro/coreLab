package corelab.structures_de_donnees.lescollections.lesmap.sortedMap.aveccomparable;

import java.util.Objects;

public class Document implements Comparable<Document> {
    private int id;
    private String name;
    private String creationDate;

    public Document(int id, String name, String creationDate) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Document document)) return false;

        return id == document.id && Objects.equals(name, document.name) && Objects.equals(creationDate, document.creationDate);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(creationDate);
        return result;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }

    /***
     * implémentation de la méthode compareTo de Comparable
     * @param otherDoc the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Document otherDoc) {
        return Integer.compare(this.getId(), otherDoc.getId());
    }
}
