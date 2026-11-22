package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    // tworzenie strumienia

    List<String> names = Arrays.asList("Tom","John","Matt","Paul");

    Stream<String> streamNames = names.stream();
    Stream<Integer> streamInt = Arrays.asList(new Integer[]{1,2,3}).stream();
    DoubleStream doubleStream = DoubleStream.of(3,3,2,1,2,4);
    IntStream intStream = IntStream.range(1,100);

    // przetwarzanie danych
    //filter - filtrowanie. za pomoca lambdy
    //map - zmiana elementu na cos innego
    // limit - zwraca nam określoną liczbe elementów
    // peek - pozwala przeprowadzić operację na każdym elemencie

    // operacje pozwalające zakończyć strumień:
    // forEach - wykonanie operacji na każdym elemencie w strumieniu
    // count - zwróci ilosc elementów w strumieniu
    // allMatch - sprawdzi czy wszystkie elementy spełniają warunek
    // collect - zwraca nowy typ na podstawie strumienia


}


