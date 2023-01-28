import java.util.*;

public class Main {
    static HashMap edges=new HashMap();
    static HashSet<String> zeroIndegreeNodes=new HashSet<>();
    static HashSet<String> toNodes=new HashSet<>();
    static int[] unions=new int[zeroIndegreeNodes.size()];
    static int[] size=new int[zeroIndegreeNodes.size()];
    static HashMap<String,Integer> ids=new HashMap<>();

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        while (sc.hasNext())
        {
            String line=sc.nextLine();
            if(line.contains("-"))
            {
                String[] arr=line.split("->");
                String from=arr[0];
                String to=arr[1];
                if(!toNodes.contains(from))
                {
                    zeroIndegreeNodes.add(from);
                }
                if(zeroIndegreeNodes.contains(to))
                {
                    zeroIndegreeNodes.remove(to);
                }
                toNodes.add(to);
                edges.put(from,to);
            }
            else if(line.contains(","))
            {
                String arr[]=line.split(",");
                ArrayList<String> nodeList=new ArrayList<>(List.of(arr));
                if(doLinkedListIntersect(nodeList))
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }
            }


        }

    }

    private static boolean doLinkedListIntersect(ArrayList<String> nodeList) throws Exception {
        if(ids.size()==0)
            unionBuilder();
        HashSet<Integer> encounteredGroups=new HashSet<>();
        for (String node:nodeList)
        {
            if(encounteredGroups.contains(find(ids.get(node))))
            {
                return true;
            }
            encounteredGroups.add(find(ids.get(node)));
        }
        return false;
    }

    public static HashMap<String,Integer> unionBuilder() throws Exception {
        int count=0;
        unions=new int[zeroIndegreeNodes.size()];
         size=new int[zeroIndegreeNodes.size()];
        for (int i = 0; i < zeroIndegreeNodes.size(); i++)
        {
            unions[i] = i;
            size[i] = 1;
        }
        for (String s:zeroIndegreeNodes)
        {
            String from=s;
            while(from!=null)
            {
                if(ids.get(from)!=null&& ids.get(from)==count)
                {
                    System.out.println("cycle detected");
                    throw new Exception();
                }
                if(ids.get(from)!=null)
                {
                    union(count,ids.get(from));
                }
                ids.put(from,count);
                if(edges.get(from)==null)
                    break;
                else
                    from= (String) edges.get(from);
            }
            count++;
        }
        return ids;

    }
  public   static int find(int i)
    {
        while (unions[i] != i)
        {
            unions[i] = unions[unions[i]]; // Skip one level
            i = unions[i]; // Move to the new level
        }
        return i;
    }

    public static void union(int xr, int yr)
    {
        if (size[xr] < size[yr]) // Make yr parent of xr
        {
            unions[xr] = unions[yr];
            size[yr] += size[xr];
        }
        else // Make xr parent of yr
        {
            unions[yr] = unions[xr];
            size[xr] += size[yr];
        }
    }
}