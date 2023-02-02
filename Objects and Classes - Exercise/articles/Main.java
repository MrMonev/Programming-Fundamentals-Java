package articles;

import javax.print.attribute.standard.RequestingUserName;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String articleDate = scanner.nextLine();
        String[] articleParts = articleDate.split(", ");
        String title = articleParts[0];
        String content = articleParts[1];
        String author = articleParts[2];
        
        Article article = new Article(title,content,author);
        
        int n = Integer.parseInt(scanner.nextLine());
        for (int commandCount = 1; commandCount <= n ; commandCount++) {
            String command = scanner.nextLine();
            // Edit {Ново съдържание}
            // ChangeAuthor,
            // Rename: { Ново заглавие }
          if (command.contains("Edit")) {
              // Променям съдържанието на моята статия с даденото
            // command = "Edit: text is good".split(": ") -> ["Edit", text is good"]
              String newContent = command.split(": ")[1];
                      article.edit(newContent);

          } else if (command.contains("Rename")) {
              // Променя заглавието на моята статия с даденото
              // command = "Rename: TestTitle.split(": ") -> ["Rename", "TestTitle"]
              String newTitle = command.split(": ")[1];
                      article.rename(newTitle);

          } else if (command.contains("ChangeAuthor")) {
              // Променя автора на моята статия с дадения автор
              // command = "ChangeAuthor: Test Testov". split(": ") -> ["ChangeAuthor", "Test Testov"]
              String newAuthor = command.split(": ")[1];
                      article.changeAuthor(newAuthor);
          }
        }
        // { tittle } - { съдържанието }: { автора }
        System.out.println(article);
    }
}
