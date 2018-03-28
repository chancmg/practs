import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FootBall{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            System.out.println(solver(n,sc));
        }
    }

    static String solver(int n,Scanner sc)
    {
        Map<String,Integer> scoreLog = new HashMap<>();
        for(int i =0;i<n;i++)
        {
            String team = sc.next();

            if(scoreLog.containsKey(team))
            {
                scoreLog.put(team,scoreLog.get(team)+1);
            }
            else
            {
                scoreLog.put(team, 1);
            }
        }
        return getTeam(scoreLog);
    }

    static String getTeam(Map<String,Integer> scoreLog)
    {
        scoreLog.
        return "Draw";
    }
}