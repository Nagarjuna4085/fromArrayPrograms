package interfaces;

interface Searchable {
    // The contract: Every searchable object must handle a string keyword
    boolean search(String keyword);
}

class Document implements Searchable {
    private String content;
    private String fileName;

    public Document(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    @Override
    public boolean search(String keyword) {
        System.out.println("Searching in Document '" + fileName + "'...");
        return content.toLowerCase().contains(keyword.toLowerCase());
    }
}

class WebPage implements Searchable {
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent) {
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword) {
        System.out.println("Searching on Web Page [" + url + "]...");
        // Web pages might have different logic, like ignoring HTML tags
        return htmlContent.toLowerCase().contains(keyword.toLowerCase());
    }
}