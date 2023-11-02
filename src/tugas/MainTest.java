package tugas;

import tugas.bfs.BreadthFirstSearch;
import tugas.dls.DepthLimitedSearch;
import tugas.ucs.NodeUCS;
import tugas.ucs.UniformCostSearch;

public class MainTest {
    public static void main(String[] args) {
        Node setiabudhi = new Node("Setiabudhi");
        Node cihampelas = new Node("Cihampelas");
        Node westuKencana = new Node("Westu kencana");
        Node bec = new Node("BEC");

        setiabudhi.addTetangga(cihampelas);
        setiabudhi.addTetangga(westuKencana);
        setiabudhi.addTetangga(bec);

        System.out.println("BFS");
        BreadthFirstSearch bfs = new BreadthFirstSearch();
        bfs.search(setiabudhi, bec);
        System.out.println();

        System.out.println("DLS");
        DepthLimitedSearch dls = new DepthLimitedSearch();
        dls.setLimit(1);
        dls.search(setiabudhi, bec);
        System.out.println();

        NodeUCS setiabudhiUCS = new NodeUCS(setiabudhi, 0);
        NodeUCS cihampelasUCS = new NodeUCS(cihampelas, 1);
        NodeUCS westukencanaUCS = new NodeUCS(westuKencana, 3);
        NodeUCS becUCS = new NodeUCS(bec, 4);

        setiabudhi.addTetangga(cihampelas);
        setiabudhi.addTetangga(westuKencana);
        setiabudhi.addTetangga(bec);


        System.out.println("UCS");
        UniformCostSearch ucs = new UniformCostSearch();
        ucs.search(setiabudhiUCS, becUCS);
        System.out.println();
    }
}