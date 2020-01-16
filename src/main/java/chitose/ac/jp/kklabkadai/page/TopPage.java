package chitose.ac.jp.kklabkadai.page;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.IModel;
import org.wicketstuff.annotation.mount.MountPath;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;

import java.util.Random;


@WicketHomePage
 @MountPath("Home")

 public class TopPage extends WebPage {
    private static IModel<String> UnseiModel=Model.of();
            public TopPage() {


                var simeiModel = Model.of("相川");
                var simeiLabel = new Label("simei", simeiModel);
                add(simeiLabel);

                var nenreiModel = Model.of("19");
                var nenreiLabel = new Label("nenrei", nenreiModel);
                add(nenreiLabel);

                var gakunenModel = Model.of("AAA");
                var gakunenLabel = new Label("gakunen", gakunenModel);
                add(gakunenLabel);

                var syumiModel = Model.of("aaa");
                var syumiLabel = new Label("syumi", syumiModel);
                add(syumiLabel);


                Form reportForm=new Form("reportForm");
                add(reportForm);
                IModel<String>reportTitleModel= Model.of("");
                reportForm.add(new TextField("reportTitle",reportTitleModel));
                reportForm.add(new Button("submitButton"){
                    @Override
                    public void onSubmit(){
                        super.onSubmit();
                        String X=reportTitleModel.getObject();
                        int x = Integer.parseInt(X);
                        if(0<x&&x<100){
                            Random rand =new Random();
                            int  num=rand.nextInt(3);
                            if(num==1) {
                                System.out.println("小吉");
                                var UnseiModel=Model.of("小吉");
                                add( new Label("Unsei", UnseiModel));
                            };
                            if(num==1){
                                System.out.println("中吉");
                                var UnseiModel=Model.of("中吉");
                                add(new Label("Unsei", UnseiModel));
                            };
                            if(num==2){
                                System.out.println("大吉");
                                var UnseiModel=Model.of("大吉");
                                add(new Label("Unsei", UnseiModel));
                            };
                            }
                            if(100<=x&&x<1000){
                            System.out.println(x);
                            var UnseiModel=Model.of(X);
                            add(new Label("Unsei", UnseiModel));
                            }

                        }
                    }
                );
                IModel<String> UnseiModel=Model.of("");
                add( new Label("Unsei", UnseiModel));


            }
}



