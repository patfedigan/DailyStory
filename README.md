# DailyStory

DailyStory is an AI-powered storytelling app that generates a new, personalized story for you every day based on your preferences and reading history.

<img src="http://i.imgur.com/nO9KPXh.png" height="640" width="360">



## Features

- **Daily Stories**: Receive a fresh, unique story every 24 hours
- **Personalization**: Stories are tailored to your preferences and past interactions
- **Offline Reading**: All stories are available offline once downloaded
- **Night Mode**: Comfortable reading experience in low-light environments
- **Text-to-Speech**: Listen to your stories with high-quality narration
- **Reading History**: Access your previously generated stories anytime
- **Story Length Control**: Choose between short (5-min), medium (10-min), or long (20-min) stories

## Installation

### Prerequisites
- Node.js 16+
- React Native CLI
- Android Studio or Xcode (for mobile development)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/patfedigan/DailyStory.git
   cd DailyStory
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Set up environment variables:
   ```bash
   cp .env.example .env
   ```
   Edit the `.env` file with your API keys

4. Start the development server:
   ```bash
   npm start
   ```

5. Run on your device:
   ```bash
   # For iOS
   npm run ios
   
   # For Android
   npm run android
   ```

## Project Structure

```
DailyStory/
├── assets/           # Images, fonts, and other static files
├── src/
│   ├── api/          # API service layer
│   ├── components/   # Reusable UI components
│   ├── contexts/     # React contexts
│   ├── hooks/        # Custom React hooks
│   ├── navigation/   # Navigation configuration
│   ├── screens/      # App screens
│   ├── services/     # Business logic services
│   ├── state/        # State management
│   ├── styles/       # Global styles
│   └── utils/        # Utility functions
├── App.js            # Application entry point
└── package.json      # Dependencies and scripts
```

## Technical Details

DailyStory is built with:
- **React Native** for cross-platform mobile development
- **Claude AI API** for generating personalized stories
- **Redux** for state management
- **AsyncStorage** for local data persistence
- **React Navigation** for screen navigation
- **React Native TTS** for text-to-speech functionality

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

Pat Fedigan - [@patfedigan](https://twitter.com/patfedigan)

Project Link: [https://github.com/patfedigan/DailyStory](https://github.com/patfedigan/DailyStory)
