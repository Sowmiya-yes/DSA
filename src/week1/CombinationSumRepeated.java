package week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumRepeated {
    static void findCandidatesRecursively(int[] candidates, List<Integer> combination,
                                          List<List<Integer>> results, int target, int start) {
        if(target == 0) {
            results.add(new ArrayList<>(combination));
            return;
        }
        for(int i = start; i < candidates.length; i++) {
            if(candidates[i] > target)
                return;
//            if(i > start && candidates[i] == candidates[i - 1])
//                continue;
            combination.add(candidates[i]);
//            findCandidatesRecursively(candidates, combination, results, target - candidates[i], i + 1);
            findCandidatesRecursively(candidates, combination, results, target - candidates[i], i );
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        int target = 7;
        int[] candidates = {2, 4, 3, 7, 4, 3};

        Arrays.sort(candidates);

        findCandidatesRecursively(candidates, combination, results, target, 0);

        System.out.println(results);
    }
}
