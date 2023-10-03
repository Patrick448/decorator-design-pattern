package FileReader;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void deveRetornarConteudo(){
        File file = new File();
        file.setContents("Conteudo");
        IFileReader fileReader = new FileReader(file);
        assertEquals("Conteudo", fileReader.parseContents());
    }

    @Test
    void deveRetornarConteudoHTML(){
        File file = new File();
        file.setContents("Conteudo");
        IFileReader fileReader = new HTMLReader(new FileReader(file));
        assertEquals("<Conteudo/>", fileReader.parseContents());
    }

    @Test
    void deveRetornarConteudoJSON(){
        File file = new File();
        file.setContents("Conteudo");
        IFileReader fileReader = new JSONReader(new FileReader(file));
        assertEquals("{Conteudo}", fileReader.parseContents());
    }

}