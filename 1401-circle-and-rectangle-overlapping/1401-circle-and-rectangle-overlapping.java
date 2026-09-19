class Solution {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        //  Wroks of rectangel
        // if(x1>xc+r || y1>yc+r || x2<xc-r || y2<yc-r)

        // return false;
        
        
        // for circle
        int cx=Math.max(Math.min(xc,x2),x1);
        int cy=Math.max(Math.min(yc,y2),y1);
        long dx=xc-cx;
        long dy=yc-cy;
        return (dx*dx+dy*dy <=(long )r*r);
    }
}