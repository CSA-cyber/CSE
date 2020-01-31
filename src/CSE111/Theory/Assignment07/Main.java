package CSE111.Theory.Assignment07;

import java.io.*;
import java.util.*;

public class Main {
    enum Choice {FILE, EXPORT, SHOW, MODIFY, ANIME, MOVIE, SERIES, USER, YES, NO}
    static Library<Media> mediaLibrary = new Library<>();
    static Scanner in = new Scanner(System.in);
    static BufferedReader br;
    static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("Output.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static Choice choice(String c) {
        if (c.equalsIgnoreCase("f"))
            return Choice.FILE;
        else if (c.equalsIgnoreCase("e"))
            return Choice.EXPORT;
        else if (c.equalsIgnoreCase("a"))
            return Choice.ANIME;
        else if(c.equalsIgnoreCase("1"))
            return Choice.SHOW;
        else if (c.equalsIgnoreCase("2"))
            return Choice.MODIFY;
        else if(c.equalsIgnoreCase("m"))
            return Choice.MOVIE;
        else if (c.equalsIgnoreCase("s"))
            return Choice.SERIES;
        else  if (c.equalsIgnoreCase("y"))
            return Choice.YES;
        else if(c.equalsIgnoreCase("n"))
            return Choice.NO;
        else if (c.equals("-1"))
            System.exit(-1);
        return Choice.USER;
    }

    static void promptMedia(String args) {
        System.out.println("What type of media you want to store?" + args);
        System.out.println("__________________________________");
        System.out.println("|Type    | Anime | Movie | Series|");
        System.out.println("__________________________________");
        System.out.println("|Keyword |   a   |   m   |   s   |");
        System.out.println("__________________________________");
    }

    static void promptMediaPrint() {
        System.out.println("What type of media you want to see?");
        System.out.println("__________________________________");
        System.out.println("|Type    | Anime | Movie | Series|");
        System.out.println("__________________________________");
        System.out.println("|Keyword |   a   |   m   |   s   |");
        System.out.println("__________________________________");
    }

    static void promptSaver() throws InputMismatchException {
        promptMedia("");
        Choice choice = choice(in.nextLine());
        if (!choice.equals(Choice.ANIME) && !choice.equals(Choice.MOVIE) && !choice.equals(Choice.SERIES)) {
            System.out.println("Wrong key-word for media type.");
            return;
        }

        System.out.println("Name: ");
        String name = in.nextLine();
        System.out.println("How much have you watched? (Minutes)");
        int minutesWatched = in.nextInt();
        System.out.println("Runtime?");
        int runtime = in.nextInt();
        in.nextLine();
        promptSaver(choice, name, minutesWatched, runtime);
    }

    static void promptSaver(Choice choice, String name, int minutesWatched, int runtime) throws InputMismatchException {
        Media a;
        switch (choice) {
            case ANIME:
                a = new Anime(name);
                break;
            case MOVIE:
                a = new Movie(name);
                break;
            case SERIES:
                a = new Series(name);
                break;
            default:
                System.out.println("Wrong key-word for media type");
                return;
        }

        a.setMinutesWatched(minutesWatched);
        a.setRuntime(runtime);
        mediaLibrary.add(a);
    }

    public static void modify() throws InputMismatchException, NumberFormatException{
        System.out.println("Enter the name of the file you want to modify:");
        mediaLibrary.print();
        Media modify = new Anime(in.nextLine());
        if (mediaLibrary.contains(modify)) {
            modify = mediaLibrary.get(modify);
            System.out.println("Choose what you want to:");
            System.out.println("Change name           : Enter 1");
            System.out.println("Change minutes watched: Enter 2");
            System.out.println("Change runtime        : Enter 3");
            System.out.println("Delete this           : Enter 4");
            switch (Integer.parseInt(in.nextLine())) {
                case 1:
                    System.out.println("New name:");
                    modify.setName(in.nextLine());
                    System.out.println("Succesfully changed name!");
                    break;
                case 2:
                    System.out.println("New minutes watched?");
                    modify.setRuntime(Integer.parseInt(in.nextLine()));
                    System.out.println("Minutes watched updated.");
                    break;
                case 3:
                    System.out.println("New runtime:");
                    modify.setRuntime(Integer.parseInt(in.nextLine()));
                    System.out.println("Runtime changed");
                    break;
                case 4:
                    modify.delete();
            }
        }
        else
            System.out.println("File not found");
    }

    static void printConditionally(Choice choice) {
        switch (choice) {
            case ANIME:
                mediaLibrary.printConditionally(new Anime());
                break;
            case MOVIE:
                mediaLibrary.printConditionally(new Movie());
                break;
            case SERIES:
                mediaLibrary.printConditionally(new Series());
                break;
            default:
                System.out.println("Wrong type");
        }
    }

    public static void main(String[] args) {
        System.out.println("Input from file press f (Not to pay respect :|) Else to give input press enter");
        Choice choice = choice(in.nextLine());
        switch (choice) {
            case USER:
                do {
                    try {
                        promptSaver();
                    } catch (InputMismatchException i) {
                        System.out.println("Runtime or minutes watched is a number geez :')");
                        in.nextLine();
                    }
                    System.out.println("Want to store more? (Y / N)");
                    choice = choice(in.nextLine());
                } while (choice.equals(Main.Choice.YES));
                System.out.println("You have loosen the ability to create more. Now choice between:");
                System.out.println("Show the files you stored: Enter 1");
                System.out.println("Modify your files        : Enter 2");
                System.out.println("Export to a txt file     : Enter e");
                choice = choice(in.nextLine());
                do {
                    switch (choice) {
                        case SHOW:
                            System.out.println("Show all files? (Y / N)");
                            switch (choice(in.nextLine())) {
                                case YES:
                                    mediaLibrary.print();
                                    break;
                                case NO:
                                    promptMediaPrint();
                                    printConditionally(choice(in.nextLine()));
                                    break;
                            }
                            System.out.println("Modify your files            : Enter 2");
                            System.out.println("Exit:                        : Enter -1");
                            System.out.println("Export to a txt file and EXIT: Enter e");
                            choice = choice(in.nextLine());
                            break;

                        case MODIFY:
                            try {
                                modify();
                            } catch (InputMismatchException i) {
                                System.out.println("Number dude number!");
                            } catch (NumberFormatException n) {
                                System.out.println("Number man number!");
                            }
                            System.out.println("Show the files you stored     : Enter 1");
                            System.out.println("Modify your files             : Enter 2");
                            System.out.println("EXIT                          : Enter -1");
                            System.out.println("Export to a txt file and EXIT : Enter e");
                            choice = choice(in.nextLine());
                        case EXPORT:
                            try {
                                fileWriter.write(mediaLibrary.toString());
                                fileWriter.flush();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            System.out.println("Exported to Output.txt for you. Now where's my cookie?\n");
                            break;
                    }
                } while (choice.equals(Main.Choice.SHOW) || choice.equals(Main.Choice.MODIFY));
                break;
            case FILE:
                try {
                    br = new BufferedReader(new FileReader("Input.txt"));
                    LinkedList<String> inputs = new LinkedList<>();
                    String s;
                    while ((s = br.readLine())!=null)
                        inputs.addAll(Arrays.asList(s.split(", ")));

                    Iterator<String> stringIterator = inputs.iterator();
                    System.out.printf("%d possible items found.\nHow many you want to take?\n", inputs.size()/3);
                    int size = in.nextInt();
                    while (size > inputs.size()/3) {
                        System.out.printf("Items need to be less than %d\n", inputs.size() / 3);
                        size = in.nextInt();
                    }

                    in.nextLine();

                    while (size-- > 0) {
                        String name = stringIterator.next();
                        int watchTime = Integer.parseInt(stringIterator.next());
                        int runTime = Integer.parseInt(stringIterator.next());
                        promptMedia(String.format(" From:\n%s\t%d\t%d", name,  watchTime, runTime));
                        choice = choice(in.nextLine());
                        promptSaver(choice, name, watchTime, runTime);
                    }

                      fileWriter.write(mediaLibrary.toString());
                      fileWriter.flush();

                } catch (FileNotFoundException f){
                    System.out.println("Output.txt not found");
                } catch (IOException ignored) {
                    System.out.println("Make sure you input correctly okay?");
                } finally {
                    System.out.println("Done!\n" +
                            "Give me bonus marks. Of course after giving full! :P");
                    in.close();

                    try {
                        br.close();
                        fileWriter.close();
                    } catch (IOException ignored) { }
                }
        }
    }
}