package com.mobiletrain.newapp.model;

import com.mobiletrain.newapp.myinterface.Song;

import java.util.List;

/**
 * Created by idea on 2016/10/8.
 */
public class QueryBean {

    /**
     * showapi_res_code : 0
     * showapi_res_error :
     * showapi_res_body : {"ret_code":0,"pagebean":{"w":"海阔天空","allPages":8,"ret_code":0,"contentlist":[{"m4a":"http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46","media_mid":"000buMWp48yjTi","songid":4829067,"singerid":2,"albumname":"华纳超极品音色系列","downUrl":"http://dl.stream.qqmusic.qq.com/4829067.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"海阔天空","albummid":"003kZ85M1cfaEF","songmid":"000buMWp48yjTi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg","albumid":63074},{"m4a":"http://ws.stream.qqmusic.qq.com/106414029.m4a?fromtag=46","media_mid":"00369bPL3QmuNf","songid":106414029,"singerid":6621,"albumname":"2016我是曹格巡演上海站","downUrl":"http://dl.stream.qqmusic.qq.com/106414029.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"曹格","songname":"海阔天空 (Live)","albummid":"0024Wx0E0VnO7y","songmid":"00369bPL3QmuNf","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/y/0024Wx0E0VnO7y.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/y/0024Wx0E0VnO7y.jpg","albumid":1379960},{"m4a":"http://ws.stream.qqmusic.qq.com/108554761.m4a?fromtag=46","media_mid":"002WyF5y4Rk1jW","songid":108554761,"singerid":1238354,"albumname":"蒙面唱将猜猜猜 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/108554761.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"尖耳朵的阿凡达妹妹","songname":"海阔天空 (Live)","albummid":"001LjNh61tMDJ1","songmid":"002WyF5y4Rk1jW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/1/001LjNh61tMDJ1.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/1/001LjNh61tMDJ1.jpg","albumid":1608672},{"m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46","media_mid":"003oD7zb38xrmk","songid":5021487,"singerid":163550,"albumname":"快乐男声2013 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5021487.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"华晨宇","songname":"海阔天空 (Live)","albummid":"002WL0KC2U1YmO","songmid":"003oD7zb38xrmk","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","albumid":433209},{"m4a":"http://ws.stream.qqmusic.qq.com/108346443.m4a?fromtag=46","media_mid":"002cvfBu2mXhqQ","songid":108346443,"singerid":1104846,"albumname":"老九门之二月红","downUrl":"http://dl.stream.qqmusic.qq.com/108346443.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"MC蓝弟","songname":"海阔天空","albummid":"002gOjgb1JsF3R","songmid":"002cvfBu2mXhqQ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/R/002gOjgb1JsF3R.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/R/002gOjgb1JsF3R.jpg","albumid":1588441},{"m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46","media_mid":"004IejcV0gPYgH","songid":7063693,"singerid":192193,"albumname":"中国新声代第二季 第7期","downUrl":"http://dl.stream.qqmusic.qq.com/7063693.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"余家辉","songname":"海阔天空 (Live)","albummid":"003Wx0212XYbFb","songmid":"004IejcV0gPYgH","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","albumid":644227},{"m4a":"http://ws.stream.qqmusic.qq.com/106683670.m4a?fromtag=46","media_mid":"002gc4Cw2yymq8","songid":106683670,"singerid":249,"albumname":"我是歌手第一季 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/106683670.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄贯中","songname":"海阔天空 (Live)","albummid":"001MoQus1nyrsh","songmid":"002gc4Cw2yymq8","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg","albumid":418538},{"m4a":"http://ws.stream.qqmusic.qq.com/1461039.m4a?fromtag=46","media_mid":"003dLAk70KSQGT","songid":1461039,"singerid":47,"albumname":"Sandy Lam Concert MMXI","downUrl":"http://dl.stream.qqmusic.qq.com/1461039.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"林忆莲","songname":"海阔天空 (Live)","albummid":"003dxkSp04utBu","songmid":"003dLAk70KSQGT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg","albumid":118237},{"m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46","media_mid":"003obJ4l0gxSLz","songid":4771269,"singerid":40049,"albumname":"DEAR DIARY","downUrl":"http://dl.stream.qqmusic.qq.com/4771269.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Robynn & Kendy","songname":"海阔天空","albummid":"001gr16p1wikdz","songmid":"003obJ4l0gxSLz","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","albumid":422399},{"m4a":"http://ws.stream.qqmusic.qq.com/95661.m4a?fromtag=46","media_mid":"003vf49P1tPdZJ","songid":95661,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95661.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"情人","albummid":"004CLlFV0mj6fC","songmid":"003vf49P1tPdZJ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46","media_mid":"001PeJps37WoGW","songid":95662,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95662.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"遥かなる梦に Far away","albummid":"004CLlFV0mj6fC","songmid":"001PeJps37WoGW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/105309397.m4a?fromtag=46","media_mid":"000dRAyI4bheI1","songid":105309397,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/105309397.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爸爸妈妈","albummid":"004CLlFV0mj6fC","songmid":"000dRAyI4bheI1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95659.m4a?fromtag=46","media_mid":"004GsGmy0c4SVi","songid":95659,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95659.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"和平与爱","albummid":"004CLlFV0mj6fC","songmid":"004GsGmy0c4SVi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/770922.m4a?fromtag=46","media_mid":"003v4h1M3NxGli","songid":770922,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/770922.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"身不由己","albummid":"004CLlFV0mj6fC","songmid":"003v4h1M3NxGli","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/480890.m4a?fromtag=46","media_mid":"000ghJEJ2gihg1","songid":480890,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/480890.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爱不容易说","albummid":"004CLlFV0mj6fC","songmid":"000ghJEJ2gihg1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46","media_mid":"003IZP3L27gVuE","songid":4914555,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914555.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"天路","albummid":"002i0gTj0Bfbq7","songmid":"003IZP3L27gVuE","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/4914554.m4a?fromtag=46","media_mid":"001OgcQv0MgCSB","songid":4914554,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914554.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"喀秋莎","albummid":"002i0gTj0Bfbq7","songmid":"001OgcQv0MgCSB","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"烧包谷","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/lm00e141f66bd914888ec5232ec41a93576f.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/5453166.m4a?fromtag=46","media_mid":"003UlMSe4g03Se","songid":5453166,"singerid":36878,"albumname":"最美和声第二季 第2期","downUrl":"http://dl.stream.qqmusic.qq.com/5453166.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"谷微","songname":"海阔天空 (Live)","albummid":"003BsgUS2MH9sS","songmid":"003UlMSe4g03Se","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS.jpg","albumid":463933},{"m4a":"http://ws.stream.qqmusic.qq.com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","songid":103147830,"singerid":366577,"albumname":"中国新声代第三季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/103147830.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"汤晶锦","songname":"海阔天空 (Live)","albummid":"003IpAjl1kDOIm","songmid":"0023Dp0X3kFGpP","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg","albumid":1064074},{"m4a":"http://ws.stream.qqmusic.qq.com/701143.m4a?fromtag=46","media_mid":"004ZQ8i11qkF5O","songid":701143,"singerid":51898,"albumname":"Under A Vast Sky","downUrl":"http://dl.stream.qqmusic.qq.com/701143.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Metro","songname":"海阔天空","albummid":"002iClXG2EaMlC","songmid":"004ZQ8i11qkF5O","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/C/002iClXG2EaMlC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/C/002iClXG2EaMlC.jpg","albumid":59274},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"面对爱情 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53.mp3?fromtag=0","singername":"谭锡禧","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0","singername":"何嘉莉","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/4798413.m4a?fromtag=46","media_mid":"001Lf2WN4gJ6R0","songid":4798413,"singerid":12330,"albumname":"","downUrl":"http://dl.stream.qqmusic.qq.com/4798413.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"DJ","songname":"海阔天空 (DJ版)","albummid":"001ZaCQY2OxVMg","songmid":"001Lf2WN4gJ6R0","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/M/g/001ZaCQY2OxVMg.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/M/g/001ZaCQY2OxVMg.jpg","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46","media_mid":"002CPh3H1Np76k","songid":7023980,"singerid":6657,"albumname":"别了家驹十五载 海阔天空音乐会","downUrl":"http://dl.stream.qqmusic.qq.com/7023980.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄家强","songname":"海阔天空 (Live)","albummid":"004ZlUW20P4i23","songmid":"002CPh3H1Np76k","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","albumid":515175},{"m4a":"http://ws.stream.qqmusic.qq.com/5097089.m4a?fromtag=46","media_mid":"003oYvtY1tNuKe","songid":5097089,"singerid":101,"albumname":"第八期 巨星之夜","downUrl":"http://dl.stream.qqmusic.qq.com/5097089.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"陶喆","songname":"海阔天空 (Live)","albummid":"001waooC4QyXTN","songmid":"003oYvtY1tNuKe","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg","albumid":447485},{"m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46","media_mid":"002QKSer3a7Tb1","songid":7149249,"singerid":198603,"albumname":"毛泽少翻唱精选","downUrl":"http://dl.stream.qqmusic.qq.com/7149249.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"毛泽少","songname":"海阔天空","albummid":"002HGLzF3OL7Vj","songmid":"002QKSer3a7Tb1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","albumid":651582},{"m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46","media_mid":"004KHI0B3uaU70","songid":8173246,"singerid":346336,"albumname":"中国梦之声第二季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/8173246.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"李邹珺","songname":"海阔天空 (Live)","albummid":"003aglPZ0ukdca","songmid":"004KHI0B3uaU70","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","albumid":751567},{"m4a":"http://ws.stream.qqmusic.qq.com/5143989.m4a?fromtag=46","media_mid":"004dAFAw2lDbze","songid":5143989,"singerid":6826,"albumname":"梦想星搭档 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5143989.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"萧煌奇","songname":"海阔天空 (Live)","albummid":"002eEJoQ4AGODB","songmid":"004dAFAw2lDbze","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/B/002eEJoQ4AGODB.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/B/002eEJoQ4AGODB.jpg","albumid":452374}],"currentPage":1,"notice":"","allNum":212,"maxResult":30}}
     */

    private int showapi_res_code;
    private String showapi_res_error;
    /**
     * ret_code : 0
     * pagebean : {"w":"海阔天空","allPages":8,"ret_code":0,"contentlist":[{"m4a":"http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46","media_mid":"000buMWp48yjTi","songid":4829067,"singerid":2,"albumname":"华纳超极品音色系列","downUrl":"http://dl.stream.qqmusic.qq.com/4829067.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"海阔天空","albummid":"003kZ85M1cfaEF","songmid":"000buMWp48yjTi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg","albumid":63074},{"m4a":"http://ws.stream.qqmusic.qq.com/106414029.m4a?fromtag=46","media_mid":"00369bPL3QmuNf","songid":106414029,"singerid":6621,"albumname":"2016我是曹格巡演上海站","downUrl":"http://dl.stream.qqmusic.qq.com/106414029.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"曹格","songname":"海阔天空 (Live)","albummid":"0024Wx0E0VnO7y","songmid":"00369bPL3QmuNf","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/y/0024Wx0E0VnO7y.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/y/0024Wx0E0VnO7y.jpg","albumid":1379960},{"m4a":"http://ws.stream.qqmusic.qq.com/108554761.m4a?fromtag=46","media_mid":"002WyF5y4Rk1jW","songid":108554761,"singerid":1238354,"albumname":"蒙面唱将猜猜猜 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/108554761.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"尖耳朵的阿凡达妹妹","songname":"海阔天空 (Live)","albummid":"001LjNh61tMDJ1","songmid":"002WyF5y4Rk1jW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/1/001LjNh61tMDJ1.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/1/001LjNh61tMDJ1.jpg","albumid":1608672},{"m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46","media_mid":"003oD7zb38xrmk","songid":5021487,"singerid":163550,"albumname":"快乐男声2013 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5021487.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"华晨宇","songname":"海阔天空 (Live)","albummid":"002WL0KC2U1YmO","songmid":"003oD7zb38xrmk","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","albumid":433209},{"m4a":"http://ws.stream.qqmusic.qq.com/108346443.m4a?fromtag=46","media_mid":"002cvfBu2mXhqQ","songid":108346443,"singerid":1104846,"albumname":"老九门之二月红","downUrl":"http://dl.stream.qqmusic.qq.com/108346443.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"MC蓝弟","songname":"海阔天空","albummid":"002gOjgb1JsF3R","songmid":"002cvfBu2mXhqQ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/R/002gOjgb1JsF3R.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/R/002gOjgb1JsF3R.jpg","albumid":1588441},{"m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46","media_mid":"004IejcV0gPYgH","songid":7063693,"singerid":192193,"albumname":"中国新声代第二季 第7期","downUrl":"http://dl.stream.qqmusic.qq.com/7063693.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"余家辉","songname":"海阔天空 (Live)","albummid":"003Wx0212XYbFb","songmid":"004IejcV0gPYgH","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","albumid":644227},{"m4a":"http://ws.stream.qqmusic.qq.com/106683670.m4a?fromtag=46","media_mid":"002gc4Cw2yymq8","songid":106683670,"singerid":249,"albumname":"我是歌手第一季 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/106683670.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄贯中","songname":"海阔天空 (Live)","albummid":"001MoQus1nyrsh","songmid":"002gc4Cw2yymq8","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg","albumid":418538},{"m4a":"http://ws.stream.qqmusic.qq.com/1461039.m4a?fromtag=46","media_mid":"003dLAk70KSQGT","songid":1461039,"singerid":47,"albumname":"Sandy Lam Concert MMXI","downUrl":"http://dl.stream.qqmusic.qq.com/1461039.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"林忆莲","songname":"海阔天空 (Live)","albummid":"003dxkSp04utBu","songmid":"003dLAk70KSQGT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg","albumid":118237},{"m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46","media_mid":"003obJ4l0gxSLz","songid":4771269,"singerid":40049,"albumname":"DEAR DIARY","downUrl":"http://dl.stream.qqmusic.qq.com/4771269.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Robynn & Kendy","songname":"海阔天空","albummid":"001gr16p1wikdz","songmid":"003obJ4l0gxSLz","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","albumid":422399},{"m4a":"http://ws.stream.qqmusic.qq.com/95661.m4a?fromtag=46","media_mid":"003vf49P1tPdZJ","songid":95661,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95661.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"情人","albummid":"004CLlFV0mj6fC","songmid":"003vf49P1tPdZJ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46","media_mid":"001PeJps37WoGW","songid":95662,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95662.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"遥かなる梦に Far away","albummid":"004CLlFV0mj6fC","songmid":"001PeJps37WoGW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/105309397.m4a?fromtag=46","media_mid":"000dRAyI4bheI1","songid":105309397,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/105309397.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爸爸妈妈","albummid":"004CLlFV0mj6fC","songmid":"000dRAyI4bheI1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95659.m4a?fromtag=46","media_mid":"004GsGmy0c4SVi","songid":95659,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95659.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"和平与爱","albummid":"004CLlFV0mj6fC","songmid":"004GsGmy0c4SVi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/770922.m4a?fromtag=46","media_mid":"003v4h1M3NxGli","songid":770922,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/770922.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"身不由己","albummid":"004CLlFV0mj6fC","songmid":"003v4h1M3NxGli","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/480890.m4a?fromtag=46","media_mid":"000ghJEJ2gihg1","songid":480890,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/480890.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爱不容易说","albummid":"004CLlFV0mj6fC","songmid":"000ghJEJ2gihg1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46","media_mid":"003IZP3L27gVuE","songid":4914555,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914555.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"天路","albummid":"002i0gTj0Bfbq7","songmid":"003IZP3L27gVuE","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/4914554.m4a?fromtag=46","media_mid":"001OgcQv0MgCSB","songid":4914554,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914554.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"喀秋莎","albummid":"002i0gTj0Bfbq7","songmid":"001OgcQv0MgCSB","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"烧包谷","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/lm00e141f66bd914888ec5232ec41a93576f.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/5453166.m4a?fromtag=46","media_mid":"003UlMSe4g03Se","songid":5453166,"singerid":36878,"albumname":"最美和声第二季 第2期","downUrl":"http://dl.stream.qqmusic.qq.com/5453166.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"谷微","songname":"海阔天空 (Live)","albummid":"003BsgUS2MH9sS","songmid":"003UlMSe4g03Se","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS.jpg","albumid":463933},{"m4a":"http://ws.stream.qqmusic.qq.com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","songid":103147830,"singerid":366577,"albumname":"中国新声代第三季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/103147830.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"汤晶锦","songname":"海阔天空 (Live)","albummid":"003IpAjl1kDOIm","songmid":"0023Dp0X3kFGpP","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg","albumid":1064074},{"m4a":"http://ws.stream.qqmusic.qq.com/701143.m4a?fromtag=46","media_mid":"004ZQ8i11qkF5O","songid":701143,"singerid":51898,"albumname":"Under A Vast Sky","downUrl":"http://dl.stream.qqmusic.qq.com/701143.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Metro","songname":"海阔天空","albummid":"002iClXG2EaMlC","songmid":"004ZQ8i11qkF5O","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/C/002iClXG2EaMlC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/C/002iClXG2EaMlC.jpg","albumid":59274},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"面对爱情 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53.mp3?fromtag=0","singername":"谭锡禧","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0","singername":"何嘉莉","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/4798413.m4a?fromtag=46","media_mid":"001Lf2WN4gJ6R0","songid":4798413,"singerid":12330,"albumname":"","downUrl":"http://dl.stream.qqmusic.qq.com/4798413.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"DJ","songname":"海阔天空 (DJ版)","albummid":"001ZaCQY2OxVMg","songmid":"001Lf2WN4gJ6R0","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/M/g/001ZaCQY2OxVMg.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/M/g/001ZaCQY2OxVMg.jpg","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46","media_mid":"002CPh3H1Np76k","songid":7023980,"singerid":6657,"albumname":"别了家驹十五载 海阔天空音乐会","downUrl":"http://dl.stream.qqmusic.qq.com/7023980.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄家强","songname":"海阔天空 (Live)","albummid":"004ZlUW20P4i23","songmid":"002CPh3H1Np76k","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","albumid":515175},{"m4a":"http://ws.stream.qqmusic.qq.com/5097089.m4a?fromtag=46","media_mid":"003oYvtY1tNuKe","songid":5097089,"singerid":101,"albumname":"第八期 巨星之夜","downUrl":"http://dl.stream.qqmusic.qq.com/5097089.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"陶喆","songname":"海阔天空 (Live)","albummid":"001waooC4QyXTN","songmid":"003oYvtY1tNuKe","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg","albumid":447485},{"m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46","media_mid":"002QKSer3a7Tb1","songid":7149249,"singerid":198603,"albumname":"毛泽少翻唱精选","downUrl":"http://dl.stream.qqmusic.qq.com/7149249.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"毛泽少","songname":"海阔天空","albummid":"002HGLzF3OL7Vj","songmid":"002QKSer3a7Tb1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","albumid":651582},{"m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46","media_mid":"004KHI0B3uaU70","songid":8173246,"singerid":346336,"albumname":"中国梦之声第二季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/8173246.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"李邹珺","songname":"海阔天空 (Live)","albummid":"003aglPZ0ukdca","songmid":"004KHI0B3uaU70","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","albumid":751567},{"m4a":"http://ws.stream.qqmusic.qq.com/5143989.m4a?fromtag=46","media_mid":"004dAFAw2lDbze","songid":5143989,"singerid":6826,"albumname":"梦想星搭档 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5143989.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"萧煌奇","songname":"海阔天空 (Live)","albummid":"002eEJoQ4AGODB","songmid":"004dAFAw2lDbze","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/B/002eEJoQ4AGODB.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/B/002eEJoQ4AGODB.jpg","albumid":452374}],"currentPage":1,"notice":"","allNum":212,"maxResult":30}
     */

    private ShowapiResBodyBean showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public ShowapiResBodyBean getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(ShowapiResBodyBean showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public static class ShowapiResBodyBean {
        private int ret_code;
        /**
         * w : 海阔天空
         * allPages : 8
         * ret_code : 0
         * contentlist : [{"m4a":"http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46","media_mid":"000buMWp48yjTi","songid":4829067,"singerid":2,"albumname":"华纳超极品音色系列","downUrl":"http://dl.stream.qqmusic.qq.com/4829067.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"海阔天空","albummid":"003kZ85M1cfaEF","songmid":"000buMWp48yjTi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg","albumid":63074},{"m4a":"http://ws.stream.qqmusic.qq.com/106414029.m4a?fromtag=46","media_mid":"00369bPL3QmuNf","songid":106414029,"singerid":6621,"albumname":"2016我是曹格巡演上海站","downUrl":"http://dl.stream.qqmusic.qq.com/106414029.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"曹格","songname":"海阔天空 (Live)","albummid":"0024Wx0E0VnO7y","songmid":"00369bPL3QmuNf","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/7/y/0024Wx0E0VnO7y.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/7/y/0024Wx0E0VnO7y.jpg","albumid":1379960},{"m4a":"http://ws.stream.qqmusic.qq.com/108554761.m4a?fromtag=46","media_mid":"002WyF5y4Rk1jW","songid":108554761,"singerid":1238354,"albumname":"蒙面唱将猜猜猜 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/108554761.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"尖耳朵的阿凡达妹妹","songname":"海阔天空 (Live)","albummid":"001LjNh61tMDJ1","songmid":"002WyF5y4Rk1jW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/J/1/001LjNh61tMDJ1.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/J/1/001LjNh61tMDJ1.jpg","albumid":1608672},{"m4a":"http://ws.stream.qqmusic.qq.com/5021487.m4a?fromtag=46","media_mid":"003oD7zb38xrmk","songid":5021487,"singerid":163550,"albumname":"快乐男声2013 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5021487.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"华晨宇","songname":"海阔天空 (Live)","albummid":"002WL0KC2U1YmO","songmid":"003oD7zb38xrmk","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/m/O/002WL0KC2U1YmO.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/m/O/002WL0KC2U1YmO.jpg","albumid":433209},{"m4a":"http://ws.stream.qqmusic.qq.com/108346443.m4a?fromtag=46","media_mid":"002cvfBu2mXhqQ","songid":108346443,"singerid":1104846,"albumname":"老九门之二月红","downUrl":"http://dl.stream.qqmusic.qq.com/108346443.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"MC蓝弟","songname":"海阔天空","albummid":"002gOjgb1JsF3R","songmid":"002cvfBu2mXhqQ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/3/R/002gOjgb1JsF3R.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/3/R/002gOjgb1JsF3R.jpg","albumid":1588441},{"m4a":"http://ws.stream.qqmusic.qq.com/7063693.m4a?fromtag=46","media_mid":"004IejcV0gPYgH","songid":7063693,"singerid":192193,"albumname":"中国新声代第二季 第7期","downUrl":"http://dl.stream.qqmusic.qq.com/7063693.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"余家辉","songname":"海阔天空 (Live)","albummid":"003Wx0212XYbFb","songmid":"004IejcV0gPYgH","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/F/b/003Wx0212XYbFb.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/F/b/003Wx0212XYbFb.jpg","albumid":644227},{"m4a":"http://ws.stream.qqmusic.qq.com/106683670.m4a?fromtag=46","media_mid":"002gc4Cw2yymq8","songid":106683670,"singerid":249,"albumname":"我是歌手第一季 第1期","downUrl":"http://dl.stream.qqmusic.qq.com/106683670.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄贯中","songname":"海阔天空 (Live)","albummid":"001MoQus1nyrsh","songmid":"002gc4Cw2yymq8","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/h/001MoQus1nyrsh.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/h/001MoQus1nyrsh.jpg","albumid":418538},{"m4a":"http://ws.stream.qqmusic.qq.com/1461039.m4a?fromtag=46","media_mid":"003dLAk70KSQGT","songid":1461039,"singerid":47,"albumname":"Sandy Lam Concert MMXI","downUrl":"http://dl.stream.qqmusic.qq.com/1461039.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"林忆莲","songname":"海阔天空 (Live)","albummid":"003dxkSp04utBu","songmid":"003dLAk70KSQGT","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/B/u/003dxkSp04utBu.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/B/u/003dxkSp04utBu.jpg","albumid":118237},{"m4a":"http://ws.stream.qqmusic.qq.com/4771269.m4a?fromtag=46","media_mid":"003obJ4l0gxSLz","songid":4771269,"singerid":40049,"albumname":"DEAR DIARY","downUrl":"http://dl.stream.qqmusic.qq.com/4771269.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Robynn & Kendy","songname":"海阔天空","albummid":"001gr16p1wikdz","songmid":"003obJ4l0gxSLz","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/d/z/001gr16p1wikdz.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/d/z/001gr16p1wikdz.jpg","albumid":422399},{"m4a":"http://ws.stream.qqmusic.qq.com/95661.m4a?fromtag=46","media_mid":"003vf49P1tPdZJ","songid":95661,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95661.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"情人","albummid":"004CLlFV0mj6fC","songmid":"003vf49P1tPdZJ","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95662.m4a?fromtag=46","media_mid":"001PeJps37WoGW","songid":95662,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95662.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"遥かなる梦に Far away","albummid":"004CLlFV0mj6fC","songmid":"001PeJps37WoGW","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/105309397.m4a?fromtag=46","media_mid":"000dRAyI4bheI1","songid":105309397,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/105309397.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爸爸妈妈","albummid":"004CLlFV0mj6fC","songmid":"000dRAyI4bheI1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/95659.m4a?fromtag=46","media_mid":"004GsGmy0c4SVi","songid":95659,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/95659.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"和平与爱","albummid":"004CLlFV0mj6fC","songmid":"004GsGmy0c4SVi","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/770922.m4a?fromtag=46","media_mid":"003v4h1M3NxGli","songid":770922,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/770922.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"身不由己","albummid":"004CLlFV0mj6fC","songmid":"003v4h1M3NxGli","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/480890.m4a?fromtag=46","media_mid":"000ghJEJ2gihg1","songid":480890,"singerid":2,"albumname":"海阔天空","downUrl":"http://dl.stream.qqmusic.qq.com/480890.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"BEYOND","songname":"爱不容易说","albummid":"004CLlFV0mj6fC","songmid":"000ghJEJ2gihg1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/f/C/004CLlFV0mj6fC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/f/C/004CLlFV0mj6fC.jpg","albumid":8067},{"m4a":"http://ws.stream.qqmusic.qq.com/4914555.m4a?fromtag=46","media_mid":"003IZP3L27gVuE","songid":4914555,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914555.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"天路","albummid":"002i0gTj0Bfbq7","songmid":"003IZP3L27gVuE","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/4914554.m4a?fromtag=46","media_mid":"001OgcQv0MgCSB","songid":4914554,"singerid":38603,"albumname":"天路","downUrl":"http://dl.stream.qqmusic.qq.com/4914554.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"海阔天空","songname":"喀秋莎","albummid":"002i0gTj0Bfbq7","songmid":"001OgcQv0MgCSB","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/q/7/002i0gTj0Bfbq7.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/q/7/002i0gTj0Bfbq7.jpg","albumid":91313},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"烧包谷","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/lm00e141f66bd914888ec5232ec41a93576f.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/5453166.m4a?fromtag=46","media_mid":"003UlMSe4g03Se","songid":5453166,"singerid":36878,"albumname":"最美和声第二季 第2期","downUrl":"http://dl.stream.qqmusic.qq.com/5453166.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"谷微","songname":"海阔天空 (Live)","albummid":"003BsgUS2MH9sS","songmid":"003UlMSe4g03Se","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/s/S/003BsgUS2MH9sS.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/s/S/003BsgUS2MH9sS.jpg","albumid":463933},{"m4a":"http://ws.stream.qqmusic.qq.com/103147830.m4a?fromtag=46","media_mid":"0023Dp0X3kFGpP","songid":103147830,"singerid":366577,"albumname":"中国新声代第三季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/103147830.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"汤晶锦","songname":"海阔天空 (Live)","albummid":"003IpAjl1kDOIm","songmid":"0023Dp0X3kFGpP","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/I/m/003IpAjl1kDOIm.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/I/m/003IpAjl1kDOIm.jpg","albumid":1064074},{"m4a":"http://ws.stream.qqmusic.qq.com/701143.m4a?fromtag=46","media_mid":"004ZQ8i11qkF5O","songid":701143,"singerid":51898,"albumname":"Under A Vast Sky","downUrl":"http://dl.stream.qqmusic.qq.com/701143.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"Metro","songname":"海阔天空","albummid":"002iClXG2EaMlC","songmid":"004ZQ8i11qkF5O","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/l/C/002iClXG2EaMlC.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/l/C/002iClXG2EaMlC.jpg","albumid":59274},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"面对爱情 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK601f8669f48d8ce044dba9f7f99c7a05dc.mp3?fromtag=0","singername":"海阔天空","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60f9d4ab926841725421f2442d371b0a53.mp3?fromtag=0","singername":"谭锡禧","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/0.m4a?fromtag=46","songname":"海阔天空 (伴奏)","albummid":"","songmid":"","songid":0,"singerid":0,"albumname":"","downUrl":"http://ws.stream.qqmusic.qq.com/TK60a427832e1c660852a926af3fa10aa250.mp3?fromtag=0","singername":"何嘉莉","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/4798413.m4a?fromtag=46","media_mid":"001Lf2WN4gJ6R0","songid":4798413,"singerid":12330,"albumname":"","downUrl":"http://dl.stream.qqmusic.qq.com/4798413.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"DJ","songname":"海阔天空 (DJ版)","albummid":"001ZaCQY2OxVMg","songmid":"001Lf2WN4gJ6R0","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/M/g/001ZaCQY2OxVMg.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/M/g/001ZaCQY2OxVMg.jpg","albumid":0},{"m4a":"http://ws.stream.qqmusic.qq.com/7023980.m4a?fromtag=46","media_mid":"002CPh3H1Np76k","songid":7023980,"singerid":6657,"albumname":"别了家驹十五载 海阔天空音乐会","downUrl":"http://dl.stream.qqmusic.qq.com/7023980.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"黄家强","songname":"海阔天空 (Live)","albummid":"004ZlUW20P4i23","songmid":"002CPh3H1Np76k","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/2/3/004ZlUW20P4i23.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/2/3/004ZlUW20P4i23.jpg","albumid":515175},{"m4a":"http://ws.stream.qqmusic.qq.com/5097089.m4a?fromtag=46","media_mid":"003oYvtY1tNuKe","songid":5097089,"singerid":101,"albumname":"第八期 巨星之夜","downUrl":"http://dl.stream.qqmusic.qq.com/5097089.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"陶喆","songname":"海阔天空 (Live)","albummid":"001waooC4QyXTN","songmid":"003oYvtY1tNuKe","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/T/N/001waooC4QyXTN.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/T/N/001waooC4QyXTN.jpg","albumid":447485},{"m4a":"http://ws.stream.qqmusic.qq.com/7149249.m4a?fromtag=46","media_mid":"002QKSer3a7Tb1","songid":7149249,"singerid":198603,"albumname":"毛泽少翻唱精选","downUrl":"http://dl.stream.qqmusic.qq.com/7149249.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"毛泽少","songname":"海阔天空","albummid":"002HGLzF3OL7Vj","songmid":"002QKSer3a7Tb1","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/V/j/002HGLzF3OL7Vj.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/V/j/002HGLzF3OL7Vj.jpg","albumid":651582},{"m4a":"http://ws.stream.qqmusic.qq.com/8173246.m4a?fromtag=46","media_mid":"004KHI0B3uaU70","songid":8173246,"singerid":346336,"albumname":"中国梦之声第二季 第5期","downUrl":"http://dl.stream.qqmusic.qq.com/8173246.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"李邹珺","songname":"海阔天空 (Live)","albummid":"003aglPZ0ukdca","songmid":"004KHI0B3uaU70","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/c/a/003aglPZ0ukdca.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/c/a/003aglPZ0ukdca.jpg","albumid":751567},{"m4a":"http://ws.stream.qqmusic.qq.com/5143989.m4a?fromtag=46","media_mid":"004dAFAw2lDbze","songid":5143989,"singerid":6826,"albumname":"梦想星搭档 总决赛","downUrl":"http://dl.stream.qqmusic.qq.com/5143989.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044","singername":"萧煌奇","songname":"海阔天空 (Live)","albummid":"002eEJoQ4AGODB","songmid":"004dAFAw2lDbze","albumpic_big":"http://i.gtimg.cn/music/photo/mid_album_300/D/B/002eEJoQ4AGODB.jpg","albumpic_small":"http://i.gtimg.cn/music/photo/mid_album_90/D/B/002eEJoQ4AGODB.jpg","albumid":452374}]
         * currentPage : 1
         * notice :
         * allNum : 212
         * maxResult : 30
         */

        private PagebeanBean pagebean;

        public int getRet_code() {
            return ret_code;
        }

        public void setRet_code(int ret_code) {
            this.ret_code = ret_code;
        }

        public PagebeanBean getPagebean() {
            return pagebean;
        }

        public void setPagebean(PagebeanBean pagebean) {
            this.pagebean = pagebean;
        }

        public static class PagebeanBean {
            private String w;
            private int allPages;
            private int ret_code;
            private int currentPage;
            private String notice;
            private int allNum;
            private int maxResult;
            /**
             * m4a : http://ws.stream.qqmusic.qq.com/4829067.m4a?fromtag=46
             * media_mid : 000buMWp48yjTi
             * songid : 4829067
             * singerid : 2
             * albumname : 华纳超极品音色系列
             * downUrl : http://dl.stream.qqmusic.qq.com/4829067.mp3?vkey=113389B41868169DE9C3C5DAC497E366171E82F2AD4BC4A82B383678DF4F8DF7ED5924D851CD88B15D0F24B260019FB8163D3A33D632B700&guid=2718671044
             * singername : BEYOND
             * songname : 海阔天空
             * albummid : 003kZ85M1cfaEF
             * songmid : 000buMWp48yjTi
             * albumpic_big : http://i.gtimg.cn/music/photo/mid_album_300/E/F/003kZ85M1cfaEF.jpg
             * albumpic_small : http://i.gtimg.cn/music/photo/mid_album_90/E/F/003kZ85M1cfaEF.jpg
             * albumid : 63074
             */

            private List<ContentlistBean> contentlist;

            public String getW() {
                return w;
            }

            public void setW(String w) {
                this.w = w;
            }

            public int getAllPages() {
                return allPages;
            }

            public void setAllPages(int allPages) {
                this.allPages = allPages;
            }

            public int getRet_code() {
                return ret_code;
            }

            public void setRet_code(int ret_code) {
                this.ret_code = ret_code;
            }

            public int getCurrentPage() {
                return currentPage;
            }

            public void setCurrentPage(int currentPage) {
                this.currentPage = currentPage;
            }

            public String getNotice() {
                return notice;
            }

            public void setNotice(String notice) {
                this.notice = notice;
            }

            public int getAllNum() {
                return allNum;
            }

            public void setAllNum(int allNum) {
                this.allNum = allNum;
            }

            public int getMaxResult() {
                return maxResult;
            }

            public void setMaxResult(int maxResult) {
                this.maxResult = maxResult;
            }

            public List<ContentlistBean> getContentlist() {
                return contentlist;
            }

            public void setContentlist(List<ContentlistBean> contentlist) {
                this.contentlist = contentlist;
            }

            public static class ContentlistBean implements Song {
                private String m4a;
                private String media_mid;
                private int songid;
                private int singerid;
                private String albumname;
                private String downUrl;
                private String singername;
                private String songname;
                private String albummid;
                private String songmid;
                private String albumpic_big;
                private String albumpic_small;
                private int albumid;

                public String getM4a() {
                    return m4a;
                }

                public void setM4a(String m4a) {
                    this.m4a = m4a;
                }

                public String getMedia_mid() {
                    return media_mid;
                }

                public void setMedia_mid(String media_mid) {
                    this.media_mid = media_mid;
                }

                public int getSongid() {
                    return songid;
                }

                public void setSongid(int songid) {
                    this.songid = songid;
                }

                public int getSingerid() {
                    return singerid;
                }

                public void setSingerid(int singerid) {
                    this.singerid = singerid;
                }

                public String getAlbumname() {
                    return albumname;
                }

                public void setAlbumname(String albumname) {
                    this.albumname = albumname;
                }

                public String getDownUrl() {
                    return downUrl;
                }

                public void setDownUrl(String downUrl) {
                    this.downUrl = downUrl;
                }

                public String getSingername() {
                    return singername;
                }

                public void setSingername(String singername) {
                    this.singername = singername;
                }

                public String getSongname() {
                    return songname;
                }

                public void setSongname(String songname) {
                    this.songname = songname;
                }

                public String getAlbummid() {
                    return albummid;
                }

                public void setAlbummid(String albummid) {
                    this.albummid = albummid;
                }

                public String getSongmid() {
                    return songmid;
                }

                public void setSongmid(String songmid) {
                    this.songmid = songmid;
                }

                public String getAlbumpic_big() {
                    return albumpic_big;
                }

                public void setAlbumpic_big(String albumpic_big) {
                    this.albumpic_big = albumpic_big;
                }

                public String getAlbumpic_small() {
                    return albumpic_small;
                }

                public void setAlbumpic_small(String albumpic_small) {
                    this.albumpic_small = albumpic_small;
                }

                public int getAlbumid() {
                    return albumid;
                }

                public void setAlbumid(int albumid) {
                    this.albumid = albumid;
                }

                @Override
                public String toString() {
                    return "ContentlistBean{" +
                            "songname='" + songname + '\'' +
                            ", singername='" + singername + '\'' +
                            ", albumname='" + albumname + '\'' +
                            '}';
                }

                @Override
                public String getIDownUrl() {
                    return getDownUrl();
                }

                @Override
                public boolean isIDownloaded() {
                    return false;
                }

                @Override
                public String getIFilePath() {
                    return null;
                }

                @Override
                public String getISongname() {
                    return getSongname();
                }

                @Override
                public String getISingername() {
                    return getSingername();
                }

                @Override
                public String getIAlbumpicSmall() {
                    return getAlbumpic_small();
                }

                @Override
                public String getIAlbumpicBig() {
                    return getAlbumpic_big();
                }

                @Override
                public int getISongId() {
                    return getSongid();
                }
            }
        }
    }
}
