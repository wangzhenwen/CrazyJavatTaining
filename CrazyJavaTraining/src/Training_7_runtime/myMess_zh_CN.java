package Training_7_runtime;

import java.util.ListResourceBundle;

public class myMess_zh_CN  extends ListResourceBundle{
   //定义资源
	private final Object myData [][] = {
			{"msg","{0},你好！今天的日期是{1}"}
	};
	@Override
	protected Object[][] getContents() {
		// TODO Auto-generated method stub
		return myData;
	}

}
