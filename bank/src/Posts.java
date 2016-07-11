
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"title",
"author",
"date_",
"data",
"id"
})
@Entity
public class Posts {

@JsonProperty("title")
private String title;
@JsonProperty("author")
private String author;
@JsonProperty("date_")
private String date;
@JsonProperty("data")
private String data;
private String subject;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
@JsonProperty("id")
private Integer id;

/**
* 
* @return
* The title
*/
@JsonProperty("title")
public String getTitle() {
return title;
}

/**
* 
* @param title
* The title
*/
@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

/**
* 
* @return
* The author
*/
@JsonProperty("author")
public String getAuthor() {
return author;
}

/**
* 
* @param author
* The author
*/
@JsonProperty("author")
public void setAuthor(String author) {
this.author = author;
}

/**
* 
* @return
* The date
*/
@JsonProperty("date_")
public String getDate() {
return date;
}

/**
* 
* @param date
* The date_
*/
@JsonProperty("date_")
public void setDate(String date) {
this.date = date;
}

/**
* 
* @return
* The data
*/
@JsonProperty("data")
public String getData() {
return data;
}

/**
* 
* @param data
* The data
*/
@JsonProperty("data")
public void setData(String data) {
this.data = data;
}

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public Integer getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}


}