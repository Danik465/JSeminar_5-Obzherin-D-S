package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    // Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
    // Пример 1:     In: arr = [1, 2]  Out: 0
    // Пример 2:     In: arr = [1, 1, 2]  Out: 1
    // Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
    public static void main(final String[] args) {
        Task1 tk = new  Task1();
        List<Integer> taskList = new ArrayList<>(List.of(1,1,1,2,2,3,3));
        System.out.println(tk.getNumberOfCouples(taskList));
    }

    public Integer getNumberOfCouples(final List<Integer> list){
        Map<Integer, Integer> checkMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i) == list.get(j)){
                    checkMap.put(list.get(i), 1+ checkMap.getOrDefault(list.get(i), 0));
                }
            }
        }
        for (Integer item: list) {
            for (Integer item2 : list)
            {
                if(item == item2){
                    checkMap.put(item, 1+ checkMap.getOrDefault(item, 0));
                }
            }

        }
        System.out.println(checkMap);
        return 0;
    }

}
