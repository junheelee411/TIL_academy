package ch12.unit02;

import java.util.ArrayList;
import java.util.List;

public class ScoreImpl implements Score {
    private List<ScoreVO> list = new ArrayList<>();

    @Override
    public void insertScore(ScoreVO vo) {
        list.add(vo);
    }

    @Override
    public List<ScoreVO> listScore() {
        return list;
    }

    @Override
    public ScoreVO findById(String hak) {
        for (ScoreVO vo : list) {
            if (vo.getHak().equals(hak)) {
                return vo;
            }
        }
        return null;
    }

    @Override
    public boolean deleteScore(String hak) {
        ScoreVO vo = findById(hak);
        if (vo != null) {
            return list.remove(vo);
        }
        return false;
    }

    @Override
    public List<ScoreVO> listScore(String name) {
        List<ScoreVO> finds = new ArrayList<>();
        for (ScoreVO vo : list) {
            if (vo.getName().equals(name)) {
                finds.add(vo);
            }
        }
        return finds;
    }
}
