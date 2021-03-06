package io.github.rogerlog.springroger.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class UserDocument {

    @Id
    private String id;
    private String name;

    public UserDocument(String id, String name) {
        super();
		this.id = id;
		this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
