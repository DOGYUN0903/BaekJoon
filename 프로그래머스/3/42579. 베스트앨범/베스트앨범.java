import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreTotal = new HashMap<>();
        Map<String, List<int[]>> genreSongs = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            genreTotal.put(genres[i], genreTotal.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for (int i = 0; i < genres.length; i++) {
            String genre = genres[i];
            
            if (!genreSongs.containsKey(genre)) {
                genreSongs.put(genre, new ArrayList<>());
            }
            
            genreSongs.get(genre).add(new int[]{i, plays[i]});
        }
        
        List<String> sortedGenres = new ArrayList<>(genreTotal.keySet());
        Collections.sort(sortedGenres, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return genreTotal.get(b) - genreTotal.get(a);
            }
        });
        
        List<Integer> answer = new ArrayList<>();
        
        for (String genre : sortedGenres) {
            List<int[]> songs = genreSongs.get(genre);
            
            Collections.sort(songs, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return b[1] - a[1];
                }
            });
            
            for (int i = 0; i < songs.size() && i < 2; i++) {
                answer.add(songs.get(i)[0]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}