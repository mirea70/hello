package solve;

public class spiralTraversal_43 {
    public static void main(String[] args) {
        Character[][] matrix = new Character[][]{
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'},
        };
        matrix = new Character[][]{
                {'T', 'y', 'r', 'i'},
                {'i', 's', 't', 'o'},
                {'n', 'r', 'e', 'n'},
                {'n', 'a', 'L', ' '},
        };
        spiralTraversal_43_Solution a = new spiralTraversal_43_Solution();
        String output = a.spiralTraversal(matrix);
        System.out.println(output);
    }
}

class spiralTraversal_43_Solution {
    public static String spiralTraversal(Character[][] matrix) {
        // TODO:
        // 문자열 담을 스트링빌더 생성
        StringBuilder sb = new StringBuilder();
        // matrix 순회
        // matrix[0] 문자들 모두 담는다.
        for (int j = 0; j < matrix[0].length; j++) {
            sb.append(matrix[0][j]);
            }
        // matrix[n]까지 matrix[i][matrix[i].length]만 모두 담는다
        for (int i = 1; i < matrix.length - 1; i++) {
            sb.append(matrix[i][matrix[i].length - 1]);
        }
        // matrix[n]부터 역순으로 문자 채우기 / 똑바로 문자 채우기 -> 인덱스 0 전까지 반복
        // 마지막 인덱스와 같은지 참조할 int값 선언
        int ck = (matrix.length - 1) % 2;
        for (int l = matrix.length - 1; l > 0 ; l--) {
            if(l % 2 == ck){
                for (int i = matrix[l].length - 1; i >=0 ; i--) {
                    sb.append(matrix[l][i]);
                }
            } else {
                for (int i = 0; i < matrix[l].length; i++) {
                    sb.append(matrix[l][i]);
                }
            }
        }
        // 순회 끝, 리턴
        return sb.toString();
    }
}
