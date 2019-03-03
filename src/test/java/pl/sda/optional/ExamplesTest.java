package pl.sda.optional;

import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Optional;

public class ExamplesTest {
    @Test
    public void whenCreateEmptyOptional_thenReturnTrue(){
        Optional<String> empty = Optional.empty();
        assertFalse(empty.isPresent());
    }
    @Test
    public  void givenNonNull(){
        String name ="testowawartosc";
        Optional<String> opt = Optional.of(name);
        assertEquals("Optional[testowa wartosc]",opt.toString());
    }
    @Test
            (expected = NullPointerException.class)
    public void givenNull_whenErrorOnCreate_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.of(name);
    }
    @Test

    public void givenNull_whenCreateNullable_thenCorrect(){
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        assertEquals("Optional.empty",opt.toString());

    }
    @Test
    public void GivenOptional_whenIfPresentOk_thenCorrect(){
        Optional<String> name = Optional.ofNullable(null);

        name.ifPresent(n -> System.out.println("Witaj: " + n));
    }
    @Test(expected = IllegalArgumentException.class)
    public void whenOrElseWorks_thenCorrect(){
        String name = null;
      //  String nameGood = Optional.ofNullable(name).orElse("Nowe Imie");
        String nameGood = Optional.ofNullable(name).orElseThrow(()->new IllegalArgumentException());


        Optional<String> opt = Optional.of("wartosc");
        opt.get();
        System.out.println(opt);
    }



}