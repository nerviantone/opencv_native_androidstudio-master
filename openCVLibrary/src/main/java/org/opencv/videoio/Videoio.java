//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.videoio;



// C++: class Videoio
//javadoc: Videoio

public class Videoio {

    public static final int
            CV_CAP_ANY = 0,
            CV_CAP_MIL = 100,
            CV_CAP_VFW = 200,
            CV_CAP_V4L = 200,
            CV_CAP_V4L2 = 200,
            CV_CAP_FIREWARE = 300,
            CV_CAP_FIREWIRE = 300,
            CV_CAP_IEEE1394 = 300,
            CV_CAP_DC1394 = 300,
            CV_CAP_CMU1394 = 300,
            CV_CAP_STEREO = 400,
            CV_CAP_TYZX = 400,
            CV_TYZX_LEFT = 400,
            CV_TYZX_RIGHT = 401,
            CV_TYZX_COLOR = 402,
            CV_TYZX_Z = 403,
            CV_CAP_QT = 500,
            CV_CAP_UNICAP = 600,
            CV_CAP_DSHOW = 700,
            CV_CAP_MSMF = 1400,
            CV_CAP_PVAPI = 800,
            CV_CAP_OPENNI = 900,
            CV_CAP_OPENNI_ASUS = 910,
            CV_CAP_ANDROID = 1000,
            CV_CAP_ANDROID_BACK = CV_CAP_ANDROID+99,
            CV_CAP_ANDROID_FRONT = CV_CAP_ANDROID+98,
            CV_CAP_XIAPI = 1100,
            CV_CAP_AVFOUNDATION = 1200,
            CV_CAP_GIGANETIX = 1300,
            CV_CAP_INTELPERC = 1500,
            CV_CAP_OPENNI2 = 1600,
            CV_CAP_GPHOTO2 = 1700,
            CV_CAP_GSTREAMER = 1800,
            CV_CAP_FFMPEG = 1900,
            CV_CAP_IMAGES = 2000,
            CV_CAP_ARAVIS = 2100,
            CV_CAP_PROP_DC1394_OFF = -4,
            CV_CAP_PROP_DC1394_MODE_MANUAL = -3,
            CV_CAP_PROP_DC1394_MODE_AUTO = -2,
            CV_CAP_PROP_DC1394_MODE_ONE_PUSH_AUTO = -1,
            CV_CAP_PROP_POS_MSEC = 0,
            CV_CAP_PROP_POS_FRAMES = 1,
            CV_CAP_PROP_POS_AVI_RATIO = 2,
            CV_CAP_PROP_FRAME_WIDTH = 3,
            CV_CAP_PROP_FRAME_HEIGHT = 4,
            CV_CAP_PROP_FPS = 5,
            CV_CAP_PROP_FOURCC = 6,
            CV_CAP_PROP_FRAME_COUNT = 7,
            CV_CAP_PROP_FORMAT = 8,
            CV_CAP_PROP_MODE = 9,
            CV_CAP_PROP_BRIGHTNESS = 10,
            CV_CAP_PROP_CONTRAST = 11,
            CV_CAP_PROP_SATURATION = 12,
            CV_CAP_PROP_HUE = 13,
            CV_CAP_PROP_GAIN = 14,
            CV_CAP_PROP_EXPOSURE = 15,
            CV_CAP_PROP_CONVERT_RGB = 16,
            CV_CAP_PROP_WHITE_BALANCE_BLUE_U = 17,
            CV_CAP_PROP_RECTIFICATION = 18,
            CV_CAP_PROP_MONOCHROME = 19,
            CV_CAP_PROP_SHARPNESS = 20,
            CV_CAP_PROP_AUTO_EXPOSURE = 21,
            CV_CAP_PROP_GAMMA = 22,
            CV_CAP_PROP_TEMPERATURE = 23,
            CV_CAP_PROP_TRIGGER = 24,
            CV_CAP_PROP_TRIGGER_DELAY = 25,
            CV_CAP_PROP_WHITE_BALANCE_RED_V = 26,
            CV_CAP_PROP_ZOOM = 27,
            CV_CAP_PROP_FOCUS = 28,
            CV_CAP_PROP_GUID = 29,
            CV_CAP_PROP_ISO_SPEED = 30,
            CV_CAP_PROP_MAX_DC1394 = 31,
            CV_CAP_PROP_BACKLIGHT = 32,
            CV_CAP_PROP_PAN = 33,
            CV_CAP_PROP_TILT = 34,
            CV_CAP_PROP_ROLL = 35,
            CV_CAP_PROP_IRIS = 36,
            CV_CAP_PROP_SETTINGS = 37,
            CV_CAP_PROP_BUFFERSIZE = 38,
            CV_CAP_PROP_AUTOFOCUS = 39,
            CV_CAP_PROP_SAR_NUM = 40,
            CV_CAP_PROP_SAR_DEN = 41,
            CV_CAP_PROP_AUTOGRAB = 1024,
            CV_CAP_PROP_SUPPORTED_PREVIEW_SIZES_STRING = 1025,
            CV_CAP_PROP_PREVIEW_FORMAT = 1026,
            CV_CAP_OPENNI_DEPTH_GENERATOR = 1 << 31,
            CV_CAP_OPENNI_IMAGE_GENERATOR = 1 << 30,
            CV_CAP_OPENNI_IR_GENERATOR = 1 << 29,
            CV_CAP_OPENNI_GENERATORS_MASK = CV_CAP_OPENNI_DEPTH_GENERATOR + CV_CAP_OPENNI_IMAGE_GENERATOR + CV_CAP_OPENNI_IR_GENERATOR,
            CV_CAP_PROP_OPENNI_OUTPUT_MODE = 100,
            CV_CAP_PROP_OPENNI_FRAME_MAX_DEPTH = 101,
            CV_CAP_PROP_OPENNI_BASELINE = 102,
            CV_CAP_PROP_OPENNI_FOCAL_LENGTH = 103,
            CV_CAP_PROP_OPENNI_REGISTRATION = 104,
            CV_CAP_PROP_OPENNI_REGISTRATION_ON = CV_CAP_PROP_OPENNI_REGISTRATION,
            CV_CAP_PROP_OPENNI_APPROX_FRAME_SYNC = 105,
            CV_CAP_PROP_OPENNI_MAX_BUFFER_SIZE = 106,
            CV_CAP_PROP_OPENNI_CIRCLE_BUFFER = 107,
            CV_CAP_PROP_OPENNI_MAX_TIME_DURATION = 108,
            CV_CAP_PROP_OPENNI_GENERATOR_PRESENT = 109,
            CV_CAP_PROP_OPENNI2_SYNC = 110,
            CV_CAP_PROP_OPENNI2_MIRROR = 111,
            CV_CAP_OPENNI_IMAGE_GENERATOR_PRESENT = CV_CAP_OPENNI_IMAGE_GENERATOR + CV_CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CV_CAP_OPENNI_IMAGE_GENERATOR_OUTPUT_MODE = CV_CAP_OPENNI_IMAGE_GENERATOR + CV_CAP_PROP_OPENNI_OUTPUT_MODE,
            CV_CAP_OPENNI_DEPTH_GENERATOR_PRESENT = CV_CAP_OPENNI_DEPTH_GENERATOR + CV_CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CV_CAP_OPENNI_DEPTH_GENERATOR_BASELINE = CV_CAP_OPENNI_DEPTH_GENERATOR + CV_CAP_PROP_OPENNI_BASELINE,
            CV_CAP_OPENNI_DEPTH_GENERATOR_FOCAL_LENGTH = CV_CAP_OPENNI_DEPTH_GENERATOR + CV_CAP_PROP_OPENNI_FOCAL_LENGTH,
            CV_CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION = CV_CAP_OPENNI_DEPTH_GENERATOR + CV_CAP_PROP_OPENNI_REGISTRATION,
            CV_CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION_ON = CV_CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION,
            CV_CAP_OPENNI_IR_GENERATOR_PRESENT = CV_CAP_OPENNI_IR_GENERATOR + CV_CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CV_CAP_GSTREAMER_QUEUE_LENGTH = 200,
            CV_CAP_PROP_PVAPI_MULTICASTIP = 300,
            CV_CAP_PROP_PVAPI_FRAMESTARTTRIGGERMODE = 301,
            CV_CAP_PROP_PVAPI_DECIMATIONHORIZONTAL = 302,
            CV_CAP_PROP_PVAPI_DECIMATIONVERTICAL = 303,
            CV_CAP_PROP_PVAPI_BINNINGX = 304,
            CV_CAP_PROP_PVAPI_BINNINGY = 305,
            CV_CAP_PROP_PVAPI_PIXELFORMAT = 306,
            CV_CAP_PROP_XI_DOWNSAMPLING = 400,
            CV_CAP_PROP_XI_DATA_FORMAT = 401,
            CV_CAP_PROP_XI_OFFSET_X = 402,
            CV_CAP_PROP_XI_OFFSET_Y = 403,
            CV_CAP_PROP_XI_TRG_SOURCE = 404,
            CV_CAP_PROP_XI_TRG_SOFTWARE = 405,
            CV_CAP_PROP_XI_GPI_SELECTOR = 406,
            CV_CAP_PROP_XI_GPI_MODE = 407,
            CV_CAP_PROP_XI_GPI_LEVEL = 408,
            CV_CAP_PROP_XI_GPO_SELECTOR = 409,
            CV_CAP_PROP_XI_GPO_MODE = 410,
            CV_CAP_PROP_XI_LED_SELECTOR = 411,
            CV_CAP_PROP_XI_LED_MODE = 412,
            CV_CAP_PROP_XI_MANUAL_WB = 413,
            CV_CAP_PROP_XI_AUTO_WB = 414,
            CV_CAP_PROP_XI_AEAG = 415,
            CV_CAP_PROP_XI_EXP_PRIORITY = 416,
            CV_CAP_PROP_XI_AE_MAX_LIMIT = 417,
            CV_CAP_PROP_XI_AG_MAX_LIMIT = 418,
            CV_CAP_PROP_XI_AEAG_LEVEL = 419,
            CV_CAP_PROP_XI_TIMEOUT = 420,
            CV_CAP_PROP_XI_EXPOSURE = 421,
            CV_CAP_PROP_XI_EXPOSURE_BURST_COUNT = 422,
            CV_CAP_PROP_XI_GAIN_SELECTOR = 423,
            CV_CAP_PROP_XI_GAIN = 424,
            CV_CAP_PROP_XI_DOWNSAMPLING_TYPE = 426,
            CV_CAP_PROP_XI_BINNING_SELECTOR = 427,
            CV_CAP_PROP_XI_BINNING_VERTICAL = 428,
            CV_CAP_PROP_XI_BINNING_HORIZONTAL = 429,
            CV_CAP_PROP_XI_BINNING_PATTERN = 430,
            CV_CAP_PROP_XI_DECIMATION_SELECTOR = 431,
            CV_CAP_PROP_XI_DECIMATION_VERTICAL = 432,
            CV_CAP_PROP_XI_DECIMATION_HORIZONTAL = 433,
            CV_CAP_PROP_XI_DECIMATION_PATTERN = 434,
            CV_CAP_PROP_XI_TEST_PATTERN_GENERATOR_SELECTOR = 587,
            CV_CAP_PROP_XI_TEST_PATTERN = 588,
            CV_CAP_PROP_XI_IMAGE_DATA_FORMAT = 435,
            CV_CAP_PROP_XI_SHUTTER_TYPE = 436,
            CV_CAP_PROP_XI_SENSOR_TAPS = 437,
            CV_CAP_PROP_XI_AEAG_ROI_OFFSET_X = 439,
            CV_CAP_PROP_XI_AEAG_ROI_OFFSET_Y = 440,
            CV_CAP_PROP_XI_AEAG_ROI_WIDTH = 441,
            CV_CAP_PROP_XI_AEAG_ROI_HEIGHT = 442,
            CV_CAP_PROP_XI_BPC = 445,
            CV_CAP_PROP_XI_WB_KR = 448,
            CV_CAP_PROP_XI_WB_KG = 449,
            CV_CAP_PROP_XI_WB_KB = 450,
            CV_CAP_PROP_XI_WIDTH = 451,
            CV_CAP_PROP_XI_HEIGHT = 452,
            CV_CAP_PROP_XI_REGION_SELECTOR = 589,
            CV_CAP_PROP_XI_REGION_MODE = 595,
            CV_CAP_PROP_XI_LIMIT_BANDWIDTH = 459,
            CV_CAP_PROP_XI_SENSOR_DATA_BIT_DEPTH = 460,
            CV_CAP_PROP_XI_OUTPUT_DATA_BIT_DEPTH = 461,
            CV_CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH = 462,
            CV_CAP_PROP_XI_OUTPUT_DATA_PACKING = 463,
            CV_CAP_PROP_XI_OUTPUT_DATA_PACKING_TYPE = 464,
            CV_CAP_PROP_XI_IS_COOLED = 465,
            CV_CAP_PROP_XI_COOLING = 466,
            CV_CAP_PROP_XI_TARGET_TEMP = 467,
            CV_CAP_PROP_XI_CHIP_TEMP = 468,
            CV_CAP_PROP_XI_HOUS_TEMP = 469,
            CV_CAP_PROP_XI_HOUS_BACK_SIDE_TEMP = 590,
            CV_CAP_PROP_XI_SENSOR_BOARD_TEMP = 596,
            CV_CAP_PROP_XI_CMS = 470,
            CV_CAP_PROP_XI_APPLY_CMS = 471,
            CV_CAP_PROP_XI_IMAGE_IS_COLOR = 474,
            CV_CAP_PROP_XI_COLOR_FILTER_ARRAY = 475,
            CV_CAP_PROP_XI_GAMMAY = 476,
            CV_CAP_PROP_XI_GAMMAC = 477,
            CV_CAP_PROP_XI_SHARPNESS = 478,
            CV_CAP_PROP_XI_CC_MATRIX_00 = 479,
            CV_CAP_PROP_XI_CC_MATRIX_01 = 480,
            CV_CAP_PROP_XI_CC_MATRIX_02 = 481,
            CV_CAP_PROP_XI_CC_MATRIX_03 = 482,
            CV_CAP_PROP_XI_CC_MATRIX_10 = 483,
            CV_CAP_PROP_XI_CC_MATRIX_11 = 484,
            CV_CAP_PROP_XI_CC_MATRIX_12 = 485,
            CV_CAP_PROP_XI_CC_MATRIX_13 = 486,
            CV_CAP_PROP_XI_CC_MATRIX_20 = 487,
            CV_CAP_PROP_XI_CC_MATRIX_21 = 488,
            CV_CAP_PROP_XI_CC_MATRIX_22 = 489,
            CV_CAP_PROP_XI_CC_MATRIX_23 = 490,
            CV_CAP_PROP_XI_CC_MATRIX_30 = 491,
            CV_CAP_PROP_XI_CC_MATRIX_31 = 492,
            CV_CAP_PROP_XI_CC_MATRIX_32 = 493,
            CV_CAP_PROP_XI_CC_MATRIX_33 = 494,
            CV_CAP_PROP_XI_DEFAULT_CC_MATRIX = 495,
            CV_CAP_PROP_XI_TRG_SELECTOR = 498,
            CV_CAP_PROP_XI_ACQ_FRAME_BURST_COUNT = 499,
            CV_CAP_PROP_XI_DEBOUNCE_EN = 507,
            CV_CAP_PROP_XI_DEBOUNCE_T0 = 508,
            CV_CAP_PROP_XI_DEBOUNCE_T1 = 509,
            CV_CAP_PROP_XI_DEBOUNCE_POL = 510,
            CV_CAP_PROP_XI_LENS_MODE = 511,
            CV_CAP_PROP_XI_LENS_APERTURE_VALUE = 512,
            CV_CAP_PROP_XI_LENS_FOCUS_MOVEMENT_VALUE = 513,
            CV_CAP_PROP_XI_LENS_FOCUS_MOVE = 514,
            CV_CAP_PROP_XI_LENS_FOCUS_DISTANCE = 515,
            CV_CAP_PROP_XI_LENS_FOCAL_LENGTH = 516,
            CV_CAP_PROP_XI_LENS_FEATURE_SELECTOR = 517,
            CV_CAP_PROP_XI_LENS_FEATURE = 518,
            CV_CAP_PROP_XI_DEVICE_MODEL_ID = 521,
            CV_CAP_PROP_XI_DEVICE_SN = 522,
            CV_CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA = 529,
            CV_CAP_PROP_XI_IMAGE_PAYLOAD_SIZE = 530,
            CV_CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT = 531,
            CV_CAP_PROP_XI_SENSOR_CLOCK_FREQ_HZ = 532,
            CV_CAP_PROP_XI_SENSOR_CLOCK_FREQ_INDEX = 533,
            CV_CAP_PROP_XI_SENSOR_OUTPUT_CHANNEL_COUNT = 534,
            CV_CAP_PROP_XI_FRAMERATE = 535,
            CV_CAP_PROP_XI_COUNTER_SELECTOR = 536,
            CV_CAP_PROP_XI_COUNTER_VALUE = 537,
            CV_CAP_PROP_XI_ACQ_TIMING_MODE = 538,
            CV_CAP_PROP_XI_AVAILABLE_BANDWIDTH = 539,
            CV_CAP_PROP_XI_BUFFER_POLICY = 540,
            CV_CAP_PROP_XI_LUT_EN = 541,
            CV_CAP_PROP_XI_LUT_INDEX = 542,
            CV_CAP_PROP_XI_LUT_VALUE = 543,
            CV_CAP_PROP_XI_TRG_DELAY = 544,
            CV_CAP_PROP_XI_TS_RST_MODE = 545,
            CV_CAP_PROP_XI_TS_RST_SOURCE = 546,
            CV_CAP_PROP_XI_IS_DEVICE_EXIST = 547,
            CV_CAP_PROP_XI_ACQ_BUFFER_SIZE = 548,
            CV_CAP_PROP_XI_ACQ_BUFFER_SIZE_UNIT = 549,
            CV_CAP_PROP_XI_ACQ_TRANSPORT_BUFFER_SIZE = 550,
            CV_CAP_PROP_XI_BUFFERS_QUEUE_SIZE = 551,
            CV_CAP_PROP_XI_ACQ_TRANSPORT_BUFFER_COMMIT = 552,
            CV_CAP_PROP_XI_RECENT_FRAME = 553,
            CV_CAP_PROP_XI_DEVICE_RESET = 554,
            CV_CAP_PROP_XI_COLUMN_FPN_CORRECTION = 555,
            CV_CAP_PROP_XI_ROW_FPN_CORRECTION = 591,
            CV_CAP_PROP_XI_SENSOR_MODE = 558,
            CV_CAP_PROP_XI_HDR = 559,
            CV_CAP_PROP_XI_HDR_KNEEPOINT_COUNT = 560,
            CV_CAP_PROP_XI_HDR_T1 = 561,
            CV_CAP_PROP_XI_HDR_T2 = 562,
            CV_CAP_PROP_XI_KNEEPOINT1 = 563,
            CV_CAP_PROP_XI_KNEEPOINT2 = 564,
            CV_CAP_PROP_XI_IMAGE_BLACK_LEVEL = 565,
            CV_CAP_PROP_XI_HW_REVISION = 571,
            CV_CAP_PROP_XI_DEBUG_LEVEL = 572,
            CV_CAP_PROP_XI_AUTO_BANDWIDTH_CALCULATION = 573,
            CV_CAP_PROP_XI_FFS_FILE_ID = 594,
            CV_CAP_PROP_XI_FFS_FILE_SIZE = 580,
            CV_CAP_PROP_XI_FREE_FFS_SIZE = 581,
            CV_CAP_PROP_XI_USED_FFS_SIZE = 582,
            CV_CAP_PROP_XI_FFS_ACCESS_KEY = 583,
            CV_CAP_PROP_XI_SENSOR_FEATURE_SELECTOR = 585,
            CV_CAP_PROP_XI_SENSOR_FEATURE_VALUE = 586,
            CV_CAP_PROP_ANDROID_FLASH_MODE = 8001,
            CV_CAP_PROP_ANDROID_FOCUS_MODE = 8002,
            CV_CAP_PROP_ANDROID_WHITE_BALANCE = 8003,
            CV_CAP_PROP_ANDROID_ANTIBANDING = 8004,
            CV_CAP_PROP_ANDROID_FOCAL_LENGTH = 8005,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_NEAR = 8006,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_OPTIMAL = 8007,
            CV_CAP_PROP_ANDROID_FOCUS_DISTANCE_FAR = 8008,
            CV_CAP_PROP_ANDROID_EXPOSE_LOCK = 8009,
            CV_CAP_PROP_ANDROID_WHITEBALANCE_LOCK = 8010,
            CV_CAP_PROP_IOS_DEVICE_FOCUS = 9001,
            CV_CAP_PROP_IOS_DEVICE_EXPOSURE = 9002,
            CV_CAP_PROP_IOS_DEVICE_FLASH = 9003,
            CV_CAP_PROP_IOS_DEVICE_WHITEBALANCE = 9004,
            CV_CAP_PROP_IOS_DEVICE_TORCH = 9005,
            CV_CAP_PROP_GIGA_FRAME_OFFSET_X = 10001,
            CV_CAP_PROP_GIGA_FRAME_OFFSET_Y = 10002,
            CV_CAP_PROP_GIGA_FRAME_WIDTH_MAX = 10003,
            CV_CAP_PROP_GIGA_FRAME_HEIGH_MAX = 10004,
            CV_CAP_PROP_GIGA_FRAME_SENS_WIDTH = 10005,
            CV_CAP_PROP_GIGA_FRAME_SENS_HEIGH = 10006,
            CV_CAP_PROP_INTELPERC_PROFILE_COUNT = 11001,
            CV_CAP_PROP_INTELPERC_PROFILE_IDX = 11002,
            CV_CAP_PROP_INTELPERC_DEPTH_LOW_CONFIDENCE_VALUE = 11003,
            CV_CAP_PROP_INTELPERC_DEPTH_SATURATION_VALUE = 11004,
            CV_CAP_PROP_INTELPERC_DEPTH_CONFIDENCE_THRESHOLD = 11005,
            CV_CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_HORZ = 11006,
            CV_CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_VERT = 11007,
            CV_CAP_INTELPERC_DEPTH_GENERATOR = 1 << 29,
            CV_CAP_INTELPERC_IMAGE_GENERATOR = 1 << 28,
            CV_CAP_INTELPERC_GENERATORS_MASK = CV_CAP_INTELPERC_DEPTH_GENERATOR + CV_CAP_INTELPERC_IMAGE_GENERATOR,
            CV_CAP_MODE_BGR = 0,
            CV_CAP_MODE_RGB = 1,
            CV_CAP_MODE_GRAY = 2,
            CV_CAP_MODE_YUYV = 3,
            CV_CAP_OPENNI_DEPTH_MAP = 0,
            CV_CAP_OPENNI_POINT_CLOUD_MAP = 1,
            CV_CAP_OPENNI_DISPARITY_MAP = 2,
            CV_CAP_OPENNI_DISPARITY_MAP_32F = 3,
            CV_CAP_OPENNI_VALID_DEPTH_MASK = 4,
            CV_CAP_OPENNI_BGR_IMAGE = 5,
            CV_CAP_OPENNI_GRAY_IMAGE = 6,
            CV_CAP_OPENNI_IR_IMAGE = 7,
            CV_CAP_OPENNI_VGA_30HZ = 0,
            CV_CAP_OPENNI_SXGA_15HZ = 1,
            CV_CAP_OPENNI_SXGA_30HZ = 2,
            CV_CAP_OPENNI_QVGA_30HZ = 3,
            CV_CAP_OPENNI_QVGA_60HZ = 4,
            CV_CAP_INTELPERC_DEPTH_MAP = 0,
            CV_CAP_INTELPERC_UVDEPTH_MAP = 1,
            CV_CAP_INTELPERC_IR_MAP = 2,
            CV_CAP_INTELPERC_IMAGE = 3,
            CV_CAP_PROP_GPHOTO2_PREVIEW = 17001,
            CV_CAP_PROP_GPHOTO2_WIDGET_ENUMERATE = 17002,
            CV_CAP_PROP_GPHOTO2_RELOAD_CONFIG = 17003,
            CV_CAP_PROP_GPHOTO2_RELOAD_ON_CHANGE = 17004,
            CV_CAP_PROP_GPHOTO2_COLLECT_MSGS = 17005,
            CV_CAP_PROP_GPHOTO2_FLUSH_MSGS = 17006,
            CV_CAP_PROP_SPEED = 17007,
            CV_CAP_PROP_APERTURE = 17008,
            CV_CAP_PROP_EXPOSUREPROGRAM = 17009,
            CV_CAP_PROP_VIEWFINDER = 17010,
            CAP_ANY = 0,
            CAP_VFW = 200,
            CAP_V4L = 200,
            CAP_V4L2 = CAP_V4L,
            CAP_FIREWIRE = 300,
            CAP_FIREWARE = CAP_FIREWIRE,
            CAP_IEEE1394 = CAP_FIREWIRE,
            CAP_DC1394 = CAP_FIREWIRE,
            CAP_CMU1394 = CAP_FIREWIRE,
            CAP_QT = 500,
            CAP_UNICAP = 600,
            CAP_DSHOW = 700,
            CAP_PVAPI = 800,
            CAP_OPENNI = 900,
            CAP_OPENNI_ASUS = 910,
            CAP_ANDROID = 1000,
            CAP_XIAPI = 1100,
            CAP_AVFOUNDATION = 1200,
            CAP_GIGANETIX = 1300,
            CAP_MSMF = 1400,
            CAP_WINRT = 1410,
            CAP_INTELPERC = 1500,
            CAP_OPENNI2 = 1600,
            CAP_OPENNI2_ASUS = 1610,
            CAP_GPHOTO2 = 1700,
            CAP_GSTREAMER = 1800,
            CAP_FFMPEG = 1900,
            CAP_IMAGES = 2000,
            CAP_ARAVIS = 2100,
            CAP_OPENCV_MJPEG = 2200,
            CAP_INTEL_MFX = 2300,
            CAP_PROP_POS_MSEC = 0,
            CAP_PROP_POS_FRAMES = 1,
            CAP_PROP_POS_AVI_RATIO = 2,
            CAP_PROP_FRAME_WIDTH = 3,
            CAP_PROP_FRAME_HEIGHT = 4,
            CAP_PROP_FPS = 5,
            CAP_PROP_FOURCC = 6,
            CAP_PROP_FRAME_COUNT = 7,
            CAP_PROP_FORMAT = 8,
            CAP_PROP_MODE = 9,
            CAP_PROP_BRIGHTNESS = 10,
            CAP_PROP_CONTRAST = 11,
            CAP_PROP_SATURATION = 12,
            CAP_PROP_HUE = 13,
            CAP_PROP_GAIN = 14,
            CAP_PROP_EXPOSURE = 15,
            CAP_PROP_CONVERT_RGB = 16,
            CAP_PROP_WHITE_BALANCE_BLUE_U = 17,
            CAP_PROP_RECTIFICATION = 18,
            CAP_PROP_MONOCHROME = 19,
            CAP_PROP_SHARPNESS = 20,
            CAP_PROP_AUTO_EXPOSURE = 21,
            CAP_PROP_GAMMA = 22,
            CAP_PROP_TEMPERATURE = 23,
            CAP_PROP_TRIGGER = 24,
            CAP_PROP_TRIGGER_DELAY = 25,
            CAP_PROP_WHITE_BALANCE_RED_V = 26,
            CAP_PROP_ZOOM = 27,
            CAP_PROP_FOCUS = 28,
            CAP_PROP_GUID = 29,
            CAP_PROP_ISO_SPEED = 30,
            CAP_PROP_BACKLIGHT = 32,
            CAP_PROP_PAN = 33,
            CAP_PROP_TILT = 34,
            CAP_PROP_ROLL = 35,
            CAP_PROP_IRIS = 36,
            CAP_PROP_SETTINGS = 37,
            CAP_PROP_BUFFERSIZE = 38,
            CAP_PROP_AUTOFOCUS = 39,
            CAP_PROP_SAR_NUM = 40,
            CAP_PROP_SAR_DEN = 41,
            CAP_MODE_BGR = 0,
            CAP_MODE_RGB = 1,
            CAP_MODE_GRAY = 2,
            CAP_MODE_YUYV = 3,
            VIDEOWRITER_PROP_QUALITY = 1,
            VIDEOWRITER_PROP_FRAMEBYTES = 2,
            VIDEOWRITER_PROP_NSTRIPES = 3,
            CAP_PROP_DC1394_OFF = -4,
            CAP_PROP_DC1394_MODE_MANUAL = -3,
            CAP_PROP_DC1394_MODE_AUTO = -2,
            CAP_PROP_DC1394_MODE_ONE_PUSH_AUTO = -1,
            CAP_PROP_DC1394_MAX = 31,
            CAP_OPENNI_DEPTH_GENERATOR = 1 << 31,
            CAP_OPENNI_IMAGE_GENERATOR = 1 << 30,
            CAP_OPENNI_IR_GENERATOR = 1 << 29,
            CAP_OPENNI_GENERATORS_MASK = CAP_OPENNI_DEPTH_GENERATOR + CAP_OPENNI_IMAGE_GENERATOR + CAP_OPENNI_IR_GENERATOR,
            CAP_PROP_OPENNI_OUTPUT_MODE = 100,
            CAP_PROP_OPENNI_FRAME_MAX_DEPTH = 101,
            CAP_PROP_OPENNI_BASELINE = 102,
            CAP_PROP_OPENNI_FOCAL_LENGTH = 103,
            CAP_PROP_OPENNI_REGISTRATION = 104,
            CAP_PROP_OPENNI_REGISTRATION_ON = CAP_PROP_OPENNI_REGISTRATION,
            CAP_PROP_OPENNI_APPROX_FRAME_SYNC = 105,
            CAP_PROP_OPENNI_MAX_BUFFER_SIZE = 106,
            CAP_PROP_OPENNI_CIRCLE_BUFFER = 107,
            CAP_PROP_OPENNI_MAX_TIME_DURATION = 108,
            CAP_PROP_OPENNI_GENERATOR_PRESENT = 109,
            CAP_PROP_OPENNI2_SYNC = 110,
            CAP_PROP_OPENNI2_MIRROR = 111,
            CAP_OPENNI_IMAGE_GENERATOR_PRESENT = CAP_OPENNI_IMAGE_GENERATOR + CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CAP_OPENNI_IMAGE_GENERATOR_OUTPUT_MODE = CAP_OPENNI_IMAGE_GENERATOR + CAP_PROP_OPENNI_OUTPUT_MODE,
            CAP_OPENNI_DEPTH_GENERATOR_PRESENT = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CAP_OPENNI_DEPTH_GENERATOR_BASELINE = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_BASELINE,
            CAP_OPENNI_DEPTH_GENERATOR_FOCAL_LENGTH = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_FOCAL_LENGTH,
            CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION = CAP_OPENNI_DEPTH_GENERATOR + CAP_PROP_OPENNI_REGISTRATION,
            CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION_ON = CAP_OPENNI_DEPTH_GENERATOR_REGISTRATION,
            CAP_OPENNI_IR_GENERATOR_PRESENT = CAP_OPENNI_IR_GENERATOR + CAP_PROP_OPENNI_GENERATOR_PRESENT,
            CAP_OPENNI_DEPTH_MAP = 0,
            CAP_OPENNI_POINT_CLOUD_MAP = 1,
            CAP_OPENNI_DISPARITY_MAP = 2,
            CAP_OPENNI_DISPARITY_MAP_32F = 3,
            CAP_OPENNI_VALID_DEPTH_MASK = 4,
            CAP_OPENNI_BGR_IMAGE = 5,
            CAP_OPENNI_GRAY_IMAGE = 6,
            CAP_OPENNI_IR_IMAGE = 7,
            CAP_OPENNI_VGA_30HZ = 0,
            CAP_OPENNI_SXGA_15HZ = 1,
            CAP_OPENNI_SXGA_30HZ = 2,
            CAP_OPENNI_QVGA_30HZ = 3,
            CAP_OPENNI_QVGA_60HZ = 4,
            CAP_PROP_GSTREAMER_QUEUE_LENGTH = 200,
            CAP_PROP_PVAPI_MULTICASTIP = 300,
            CAP_PROP_PVAPI_FRAMESTARTTRIGGERMODE = 301,
            CAP_PROP_PVAPI_DECIMATIONHORIZONTAL = 302,
            CAP_PROP_PVAPI_DECIMATIONVERTICAL = 303,
            CAP_PROP_PVAPI_BINNINGX = 304,
            CAP_PROP_PVAPI_BINNINGY = 305,
            CAP_PROP_PVAPI_PIXELFORMAT = 306,
            CAP_PVAPI_FSTRIGMODE_FREERUN = 0,
            CAP_PVAPI_FSTRIGMODE_SYNCIN1 = 1,
            CAP_PVAPI_FSTRIGMODE_SYNCIN2 = 2,
            CAP_PVAPI_FSTRIGMODE_FIXEDRATE = 3,
            CAP_PVAPI_FSTRIGMODE_SOFTWARE = 4,
            CAP_PVAPI_DECIMATION_OFF = 1,
            CAP_PVAPI_DECIMATION_2OUTOF4 = 2,
            CAP_PVAPI_DECIMATION_2OUTOF8 = 4,
            CAP_PVAPI_DECIMATION_2OUTOF16 = 8,
            CAP_PVAPI_PIXELFORMAT_MONO8 = 1,
            CAP_PVAPI_PIXELFORMAT_MONO16 = 2,
            CAP_PVAPI_PIXELFORMAT_BAYER8 = 3,
            CAP_PVAPI_PIXELFORMAT_BAYER16 = 4,
            CAP_PVAPI_PIXELFORMAT_RGB24 = 5,
            CAP_PVAPI_PIXELFORMAT_BGR24 = 6,
            CAP_PVAPI_PIXELFORMAT_RGBA32 = 7,
            CAP_PVAPI_PIXELFORMAT_BGRA32 = 8,
            CAP_PROP_XI_DOWNSAMPLING = 400,
            CAP_PROP_XI_DATA_FORMAT = 401,
            CAP_PROP_XI_OFFSET_X = 402,
            CAP_PROP_XI_OFFSET_Y = 403,
            CAP_PROP_XI_TRG_SOURCE = 404,
            CAP_PROP_XI_TRG_SOFTWARE = 405,
            CAP_PROP_XI_GPI_SELECTOR = 406,
            CAP_PROP_XI_GPI_MODE = 407,
            CAP_PROP_XI_GPI_LEVEL = 408,
            CAP_PROP_XI_GPO_SELECTOR = 409,
            CAP_PROP_XI_GPO_MODE = 410,
            CAP_PROP_XI_LED_SELECTOR = 411,
            CAP_PROP_XI_LED_MODE = 412,
            CAP_PROP_XI_MANUAL_WB = 413,
            CAP_PROP_XI_AUTO_WB = 414,
            CAP_PROP_XI_AEAG = 415,
            CAP_PROP_XI_EXP_PRIORITY = 416,
            CAP_PROP_XI_AE_MAX_LIMIT = 417,
            CAP_PROP_XI_AG_MAX_LIMIT = 418,
            CAP_PROP_XI_AEAG_LEVEL = 419,
            CAP_PROP_XI_TIMEOUT = 420,
            CAP_PROP_XI_EXPOSURE = 421,
            CAP_PROP_XI_EXPOSURE_BURST_COUNT = 422,
            CAP_PROP_XI_GAIN_SELECTOR = 423,
            CAP_PROP_XI_GAIN = 424,
            CAP_PROP_XI_DOWNSAMPLING_TYPE = 426,
            CAP_PROP_XI_BINNING_SELECTOR = 427,
            CAP_PROP_XI_BINNING_VERTICAL = 428,
            CAP_PROP_XI_BINNING_HORIZONTAL = 429,
            CAP_PROP_XI_BINNING_PATTERN = 430,
            CAP_PROP_XI_DECIMATION_SELECTOR = 431,
            CAP_PROP_XI_DECIMATION_VERTICAL = 432,
            CAP_PROP_XI_DECIMATION_HORIZONTAL = 433,
            CAP_PROP_XI_DECIMATION_PATTERN = 434,
            CAP_PROP_XI_TEST_PATTERN_GENERATOR_SELECTOR = 587,
            CAP_PROP_XI_TEST_PATTERN = 588,
            CAP_PROP_XI_IMAGE_DATA_FORMAT = 435,
            CAP_PROP_XI_SHUTTER_TYPE = 436,
            CAP_PROP_XI_SENSOR_TAPS = 437,
            CAP_PROP_XI_AEAG_ROI_OFFSET_X = 439,
            CAP_PROP_XI_AEAG_ROI_OFFSET_Y = 440,
            CAP_PROP_XI_AEAG_ROI_WIDTH = 441,
            CAP_PROP_XI_AEAG_ROI_HEIGHT = 442,
            CAP_PROP_XI_BPC = 445,
            CAP_PROP_XI_WB_KR = 448,
            CAP_PROP_XI_WB_KG = 449,
            CAP_PROP_XI_WB_KB = 450,
            CAP_PROP_XI_WIDTH = 451,
            CAP_PROP_XI_HEIGHT = 452,
            CAP_PROP_XI_REGION_SELECTOR = 589,
            CAP_PROP_XI_REGION_MODE = 595,
            CAP_PROP_XI_LIMIT_BANDWIDTH = 459,
            CAP_PROP_XI_SENSOR_DATA_BIT_DEPTH = 460,
            CAP_PROP_XI_OUTPUT_DATA_BIT_DEPTH = 461,
            CAP_PROP_XI_IMAGE_DATA_BIT_DEPTH = 462,
            CAP_PROP_XI_OUTPUT_DATA_PACKING = 463,
            CAP_PROP_XI_OUTPUT_DATA_PACKING_TYPE = 464,
            CAP_PROP_XI_IS_COOLED = 465,
            CAP_PROP_XI_COOLING = 466,
            CAP_PROP_XI_TARGET_TEMP = 467,
            CAP_PROP_XI_CHIP_TEMP = 468,
            CAP_PROP_XI_HOUS_TEMP = 469,
            CAP_PROP_XI_HOUS_BACK_SIDE_TEMP = 590,
            CAP_PROP_XI_SENSOR_BOARD_TEMP = 596,
            CAP_PROP_XI_CMS = 470,
            CAP_PROP_XI_APPLY_CMS = 471,
            CAP_PROP_XI_IMAGE_IS_COLOR = 474,
            CAP_PROP_XI_COLOR_FILTER_ARRAY = 475,
            CAP_PROP_XI_GAMMAY = 476,
            CAP_PROP_XI_GAMMAC = 477,
            CAP_PROP_XI_SHARPNESS = 478,
            CAP_PROP_XI_CC_MATRIX_00 = 479,
            CAP_PROP_XI_CC_MATRIX_01 = 480,
            CAP_PROP_XI_CC_MATRIX_02 = 481,
            CAP_PROP_XI_CC_MATRIX_03 = 482,
            CAP_PROP_XI_CC_MATRIX_10 = 483,
            CAP_PROP_XI_CC_MATRIX_11 = 484,
            CAP_PROP_XI_CC_MATRIX_12 = 485,
            CAP_PROP_XI_CC_MATRIX_13 = 486,
            CAP_PROP_XI_CC_MATRIX_20 = 487,
            CAP_PROP_XI_CC_MATRIX_21 = 488,
            CAP_PROP_XI_CC_MATRIX_22 = 489,
            CAP_PROP_XI_CC_MATRIX_23 = 490,
            CAP_PROP_XI_CC_MATRIX_30 = 491,
            CAP_PROP_XI_CC_MATRIX_31 = 492,
            CAP_PROP_XI_CC_MATRIX_32 = 493,
            CAP_PROP_XI_CC_MATRIX_33 = 494,
            CAP_PROP_XI_DEFAULT_CC_MATRIX = 495,
            CAP_PROP_XI_TRG_SELECTOR = 498,
            CAP_PROP_XI_ACQ_FRAME_BURST_COUNT = 499,
            CAP_PROP_XI_DEBOUNCE_EN = 507,
            CAP_PROP_XI_DEBOUNCE_T0 = 508,
            CAP_PROP_XI_DEBOUNCE_T1 = 509,
            CAP_PROP_XI_DEBOUNCE_POL = 510,
            CAP_PROP_XI_LENS_MODE = 511,
            CAP_PROP_XI_LENS_APERTURE_VALUE = 512,
            CAP_PROP_XI_LENS_FOCUS_MOVEMENT_VALUE = 513,
            CAP_PROP_XI_LENS_FOCUS_MOVE = 514,
            CAP_PROP_XI_LENS_FOCUS_DISTANCE = 515,
            CAP_PROP_XI_LENS_FOCAL_LENGTH = 516,
            CAP_PROP_XI_LENS_FEATURE_SELECTOR = 517,
            CAP_PROP_XI_LENS_FEATURE = 518,
            CAP_PROP_XI_DEVICE_MODEL_ID = 521,
            CAP_PROP_XI_DEVICE_SN = 522,
            CAP_PROP_XI_IMAGE_DATA_FORMAT_RGB32_ALPHA = 529,
            CAP_PROP_XI_IMAGE_PAYLOAD_SIZE = 530,
            CAP_PROP_XI_TRANSPORT_PIXEL_FORMAT = 531,
            CAP_PROP_XI_SENSOR_CLOCK_FREQ_HZ = 532,
            CAP_PROP_XI_SENSOR_CLOCK_FREQ_INDEX = 533,
            CAP_PROP_XI_SENSOR_OUTPUT_CHANNEL_COUNT = 534,
            CAP_PROP_XI_FRAMERATE = 535,
            CAP_PROP_XI_COUNTER_SELECTOR = 536,
            CAP_PROP_XI_COUNTER_VALUE = 537,
            CAP_PROP_XI_ACQ_TIMING_MODE = 538,
            CAP_PROP_XI_AVAILABLE_BANDWIDTH = 539,
            CAP_PROP_XI_BUFFER_POLICY = 540,
            CAP_PROP_XI_LUT_EN = 541,
            CAP_PROP_XI_LUT_INDEX = 542,
            CAP_PROP_XI_LUT_VALUE = 543,
            CAP_PROP_XI_TRG_DELAY = 544,
            CAP_PROP_XI_TS_RST_MODE = 545,
            CAP_PROP_XI_TS_RST_SOURCE = 546,
            CAP_PROP_XI_IS_DEVICE_EXIST = 547,
            CAP_PROP_XI_ACQ_BUFFER_SIZE = 548,
            CAP_PROP_XI_ACQ_BUFFER_SIZE_UNIT = 549,
            CAP_PROP_XI_ACQ_TRANSPORT_BUFFER_SIZE = 550,
            CAP_PROP_XI_BUFFERS_QUEUE_SIZE = 551,
            CAP_PROP_XI_ACQ_TRANSPORT_BUFFER_COMMIT = 552,
            CAP_PROP_XI_RECENT_FRAME = 553,
            CAP_PROP_XI_DEVICE_RESET = 554,
            CAP_PROP_XI_COLUMN_FPN_CORRECTION = 555,
            CAP_PROP_XI_ROW_FPN_CORRECTION = 591,
            CAP_PROP_XI_SENSOR_MODE = 558,
            CAP_PROP_XI_HDR = 559,
            CAP_PROP_XI_HDR_KNEEPOINT_COUNT = 560,
            CAP_PROP_XI_HDR_T1 = 561,
            CAP_PROP_XI_HDR_T2 = 562,
            CAP_PROP_XI_KNEEPOINT1 = 563,
            CAP_PROP_XI_KNEEPOINT2 = 564,
            CAP_PROP_XI_IMAGE_BLACK_LEVEL = 565,
            CAP_PROP_XI_HW_REVISION = 571,
            CAP_PROP_XI_DEBUG_LEVEL = 572,
            CAP_PROP_XI_AUTO_BANDWIDTH_CALCULATION = 573,
            CAP_PROP_XI_FFS_FILE_ID = 594,
            CAP_PROP_XI_FFS_FILE_SIZE = 580,
            CAP_PROP_XI_FREE_FFS_SIZE = 581,
            CAP_PROP_XI_USED_FFS_SIZE = 582,
            CAP_PROP_XI_FFS_ACCESS_KEY = 583,
            CAP_PROP_XI_SENSOR_FEATURE_SELECTOR = 585,
            CAP_PROP_XI_SENSOR_FEATURE_VALUE = 586,
            CAP_PROP_IOS_DEVICE_FOCUS = 9001,
            CAP_PROP_IOS_DEVICE_EXPOSURE = 9002,
            CAP_PROP_IOS_DEVICE_FLASH = 9003,
            CAP_PROP_IOS_DEVICE_WHITEBALANCE = 9004,
            CAP_PROP_IOS_DEVICE_TORCH = 9005,
            CAP_PROP_GIGA_FRAME_OFFSET_X = 10001,
            CAP_PROP_GIGA_FRAME_OFFSET_Y = 10002,
            CAP_PROP_GIGA_FRAME_WIDTH_MAX = 10003,
            CAP_PROP_GIGA_FRAME_HEIGH_MAX = 10004,
            CAP_PROP_GIGA_FRAME_SENS_WIDTH = 10005,
            CAP_PROP_GIGA_FRAME_SENS_HEIGH = 10006,
            CAP_PROP_INTELPERC_PROFILE_COUNT = 11001,
            CAP_PROP_INTELPERC_PROFILE_IDX = 11002,
            CAP_PROP_INTELPERC_DEPTH_LOW_CONFIDENCE_VALUE = 11003,
            CAP_PROP_INTELPERC_DEPTH_SATURATION_VALUE = 11004,
            CAP_PROP_INTELPERC_DEPTH_CONFIDENCE_THRESHOLD = 11005,
            CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_HORZ = 11006,
            CAP_PROP_INTELPERC_DEPTH_FOCAL_LENGTH_VERT = 11007,
            CAP_INTELPERC_DEPTH_GENERATOR = 1 << 29,
            CAP_INTELPERC_IMAGE_GENERATOR = 1 << 28,
            CAP_INTELPERC_GENERATORS_MASK = CAP_INTELPERC_DEPTH_GENERATOR + CAP_INTELPERC_IMAGE_GENERATOR,
            CAP_INTELPERC_DEPTH_MAP = 0,
            CAP_INTELPERC_UVDEPTH_MAP = 1,
            CAP_INTELPERC_IR_MAP = 2,
            CAP_INTELPERC_IMAGE = 3,
            CAP_PROP_GPHOTO2_PREVIEW = 17001,
            CAP_PROP_GPHOTO2_WIDGET_ENUMERATE = 17002,
            CAP_PROP_GPHOTO2_RELOAD_CONFIG = 17003,
            CAP_PROP_GPHOTO2_RELOAD_ON_CHANGE = 17004,
            CAP_PROP_GPHOTO2_COLLECT_MSGS = 17005,
            CAP_PROP_GPHOTO2_FLUSH_MSGS = 17006,
            CAP_PROP_SPEED = 17007,
            CAP_PROP_APERTURE = 17008,
            CAP_PROP_EXPOSUREPROGRAM = 17009,
            CAP_PROP_VIEWFINDER = 17010,
            CAP_PROP_IMAGES_BASE = 18000,
            CAP_PROP_IMAGES_LAST = 19000;




}
