package articles;

public class Article {
    // полета -> характеристики
    private String title; // Заглавие на статия
    private String content; // Съдържанието на статията
    private String author; // Автора на статията



    // Коструктор -> създава нови обекти
    // alt + insert -> Constructor
    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void edit(String newContent) {
        this.content = newContent;
    }
    public  void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void rename(String newTitle) {
        this.title = newTitle;
    }
    // Вграден метод toString -> превърне обекта в текст -> {packageName}.{className}@{address}
    // @Override // пренаписва default method
    public  String toString() {
        // { tittle } - { съдържанието }: { автора }
       // return this.title + " - " + this.content + ": " + this.author;
        // Вграден метод toString -> превърне обекта в текст ->         // { tittle } - { съдържанието }: { автора }
 return String.format("%s - %s: %s", this.title,this.content,this.author);
    }
}
