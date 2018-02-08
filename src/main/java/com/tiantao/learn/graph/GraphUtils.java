package com.tiantao.learn.graph;

import javax.swing.*;
import java.awt.*;

/**
 * Created by tiantao on 2018/1/10.
 */
public class GraphUtils extends JFrame {


    private GraphUtils.MyCanvas trendChartCanvas = new GraphUtils.MyCanvas();

    private static final int MAX_VALUE = 180;// 接受到的数据最大值
    private static final int MAX_COUNT_OF_VALUES = 50;// 最多保存数据的个数

    // 框架起点坐标
    private final int FREAME_X = 50;
    private final int FREAME_Y = 50;
    private final int FREAME_WIDTH = 1000;// 横
    private final int FREAME_HEIGHT = 600;// 纵

    // 原点坐标
    private final int Origin_X = FREAME_X + 50;
    private final int Origin_Y = FREAME_Y + FREAME_HEIGHT - 30;

    // X,Y轴终点坐标
    private final int XAxis_X = FREAME_X + FREAME_WIDTH + 100;
    private final int XAxis_Y = Origin_Y;
    private final int YAxis_X = Origin_X;
    private final int YAxis_Y = FREAME_Y + 100;

    // X轴上的时间分度值（1分度=40像素）
    private final int TIME_INTERVAL = 50;
    // Y轴上值
    private final int PRESS_INTERVAL = 30;

    /**
     * Constructs a new frame that is initially invisible.
     * <p>
     * This constructor sets the component's locale property to the value
     * returned by <code>JComponent.getDefaultLocale</code>.
     *
     * @throws HeadlessException if GraphicsEnvironment.isHeadless()
     *                           returns true.
     * @see GraphicsEnvironment#isHeadless
     * @see Component#setSize
     * @see Component#setVisible
     * @see JComponent#getDefaultLocale
     */
    public GraphUtils() throws HeadlessException {
        super("曲线图：");

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(300, 200, 1500, 1200);
        this.add(trendChartCanvas, BorderLayout.CENTER);
        this.setVisible(true);
    }


    // 画布重绘图
    class MyCanvas extends JPanel {
        private static final long serialVersionUID = 1L;

        public void paintComponent(Graphics g) {
            Graphics2D g2D = (Graphics2D) g;

            Color c = new Color(200, 70, 0);
            g.setColor(c);
            super.paintComponent(g);

            // 绘制平滑点的曲线
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            int w = XAxis_X;// 起始点
            int xDelta = w / MAX_COUNT_OF_VALUES;


            for (int i = 0; i < 22; ++i) {
                g2D.drawLine(Origin_X +(i*10), Origin_Y - (i * i), Origin_X+(i+1)*10, Origin_Y - (i+1)*(i+1));
            }


            // 画坐标轴
            g2D.setStroke(new BasicStroke(Float.parseFloat("2.0F")));// 轴线粗度
            // X轴以及方向箭头
            g.drawLine(Origin_X, Origin_Y, XAxis_X, XAxis_Y);// x轴线的轴线
            g.drawLine(XAxis_X, XAxis_Y, XAxis_X - 5, XAxis_Y - 5);// 上边箭头
            g.drawLine( XAxis_X - 5, XAxis_Y + 5, XAxis_X, XAxis_Y);// 下边箭头

            // Y轴以及方向箭头
            g.drawLine(Origin_X, Origin_Y, YAxis_X, YAxis_Y);
            g.drawLine(YAxis_X, YAxis_Y, YAxis_X - 5, YAxis_Y + 5);
            g.drawLine(YAxis_X, YAxis_Y, YAxis_X + 5, YAxis_Y + 5);

            // 画X轴上的时间刻度（从坐标轴原点起，每隔TIME_INTERVAL(时间分度)像素画一时间点，到X轴终点止）
            g.setColor(Color.BLUE);
            g2D.setStroke(new BasicStroke(Float.parseFloat("1.0f")));

            // X轴刻度依次变化情况
            for (int i = Origin_X, j = 0; i < XAxis_X; i += TIME_INTERVAL, j += TIME_INTERVAL) {
                g.drawString(" " + j, i - 10, Origin_Y + 20);
            }
            g.drawString("n", XAxis_X + 5, XAxis_Y + 5);

            // 画Y轴上血压刻度（从坐标原点起，每隔10像素画一压力值，到Y轴终点止）
            for (int i = Origin_Y, j = 0; i > YAxis_Y; i -= PRESS_INTERVAL, j += TIME_INTERVAL) {
                g.drawString(j + " ", Origin_X - 30, i + 3);
            }
            g.drawString("time", YAxis_X - 5, YAxis_Y - 5);// 血压刻度小箭头值
            // 画网格线
            g.setColor(Color.BLACK);
            // 坐标内部横线
            for (int i = Origin_Y; i > YAxis_Y; i -= PRESS_INTERVAL) {
                g.drawLine(Origin_X, i, Origin_X + 20 * TIME_INTERVAL, i);
            }
            // 坐标内部竖线
            for (int i = Origin_X; i < XAxis_X; i += TIME_INTERVAL) {
                g.drawLine(i, Origin_Y, i, Origin_Y - 15 * PRESS_INTERVAL);
            }

        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new GraphUtils();
    }
}
